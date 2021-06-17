//@flow
import React from 'react'

import VerificaPedidos from './VerificaPedidos.jsx'
import 'bulma/css/bulma.min.css'

//FIXME O código da aplicação está completo.
// Sua tarefa é colocar esta aplicação no seu servidor na nuvem UFSC.

function App () {
  return (
    <div className='container is-fluid'>
      <div className="message is-dark">
        <div className="message-header">
          UFSC - CTC - INE - INE5646 :: App Compra Vende :: Vendedor
        </div>
        <div className="message-body">
          <div className='columns'>
            <div className='column'>
              <VerificaPedidos/>
            </div>
          </div>
        </div>
      </div>
    </div>
  )
}


export default App
