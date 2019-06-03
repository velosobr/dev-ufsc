/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaprincipal;

/**
 *
 * @author Linnety3
 */
public class mainTelaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        try {
          ControladorClientes ctrlCli =  ControladorClientes.getInstancia();
          ControladorClientes ctrlCli2 =  ControladorClientes.getInstancia();
  
        } catch (Exception e) {
            //soh pra funcionar
        }
            
        
        //  ControladorClientes ctrlCli2 = new ControladorClientes();

//        TelaPrincipal mainView = new TelaPrincipal();
//       
//        mainView.setVisible(true);
    }

}
