/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.MenuInicio;
import View.ViewProduto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import sun.applet.Main;

/**
 *
 * @author gabrielp
 */
public class menuController {
    private MenuInicio theMenuView;
    private ViewProduto theProduto;
    
    public menuController(MenuInicio theMenuView){
        this.theMenuView = theMenuView;
        this.theMenuView.addBtnPedidoListanner(new BtnPedidoListanner());
        this.theMenuView.addBtnProdutoListanner(new BtnProdutoListanner());
        this.theMenuView.add(new JDesktopPane());
    }

    private class BtnPedidoListanner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
    }
    private class BtnProdutoListanner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            ViewProduto p = new ViewProduto();
            p.setVisible(true);
        }
        
    }
    
    
    
}

