import React, { useState, useEffect } from 'react'

import pesquisa from '../model/pesquisa'
import MostraRelatorio from './MostraRelatorio.jsx'
import DataNASA from './DataNASA.jsx'

const estadoInicial = {
  data: undefined,
  relatorio: undefined,
  nomeBotao: 'Pesquisar asteroides',
  cssBotao: 'button is-danger',
  pesquisando: false,
  nasaApiKey: undefined
}

function useModelo() {

  const [estado, setEstado] = useState(estadoInicial)

  function naoPodePesquisar () {
    return estado.pesquisando === true || estado.data === undefined 
      || estado.nasaApiKey === undefined || estado.relatorio !== undefined
  }

  function onDataInvalida () {
    setEstado({...estadoInicial, nasaApiKey: estado.nasaApiKey})
  }

  function onDataValida (novaData) {
    setEstado({...estado, data: novaData, relatorio: undefined, 
      pesquisando: false, cssBotao: 'button is-success'})
  }

  function onPesquisando() {
    setEstado({...estado, relatorio: undefined, nomeBotao: 'Pesquisando...', pesquisando: true,
      cssBotao: 'button is-warning is-loading'})
  }


  useEffect(() => { 
    function deuErro(erro) {
      setEstado({...estadoInicial, nomeBotao: erro.message, cssBotao: 'button is-black', pesquisando: false})
    }

    window.fetch('/chave')
      .then(resposta => resposta.json())
      .then(nasaApiKey => setEstado({...estadoInicial, nasaApiKey}))
      .catch(erro => deuErro(erro))
  }, [])

  useEffect(() => {
    function onRelatorio (relatorio) {
      setEstado(estado => ({...estado, relatorio, nomeBotao: 'Pesquisar asteróides', 
        cssBotao: 'button is-success', pesquisando: false}))
    }
  
    function onErro(erro) {
      setEstado(estado => ({...estado, nomeBotao: erro.message, cssBotao: 'button is-black', pesquisando: false}))
    }
  
    if (estado.pesquisando) {
      pesquisa(estado.nasaApiKey, estado.data)
        .then(relatorio => onRelatorio(relatorio))
        .catch(erro => onErro(erro))
    }
  }, [estado.data, estado.nasaApiKey, estado.pesquisando])

  return [ estado,  {onDataInvalida, onDataValida, onPesquisando, naoPodePesquisar} ]
}


function App () {
  const [ estado,  {onDataValida, onDataInvalida, onPesquisando, naoPodePesquisar} ] = useModelo()

  let oRelatorio

  if (estado.relatorio !== undefined) {
    oRelatorio = <MostraRelatorio relatorio={estado.relatorio} />
  }

  return (
    <div className='container is-fluid'>
      <div className='message'>
        <div className='message-header'>
            UFSC - CTC - INE - INE5646 :: App Fim do Mundo
        </div>
        <div className='message-body'>
          <DataNASA onDataValida={onDataValida} onDataInvalida={onDataInvalida}/>
          <button className={estado.cssBotao}
            onClick={onPesquisando}
            disabled={naoPodePesquisar()}>
            {estado.nomeBotao}
          </button>
          {oRelatorio}
        </div>
      </div>
    </div>
  )  
}


export default App
