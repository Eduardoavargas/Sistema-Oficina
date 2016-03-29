/*
 * The MIT License
 *
 * Copyright 2016 eduardo.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package view;

/**
 *
 * @author eduardo
 */

/**
 * @see Classe utilizada para iniciar o programa, seleciona o look and feal e
 * abre a tela principal.
 * @author Eduardo Vargas
 * @version 1.0000.00.00 Beta
 */
public class Index {

    /**
     * @see Método principal da classe, carrega lookAndFeel padrão como Windows
     * e define a ViewPrincipal como visível.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tenta selecionar o Windows look and feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Instancia o ViewPrincipal para setar sua visibilidade como verdadeira.
        ViewPrincipal viewPrincipal = new ViewPrincipal();
        viewPrincipal.setVisible(true);

        //Teste restricões.
//        String x = "0123456789abcdefghijklmnopqrstuvwxyz";
//        if (x.contains("r")) {
//            System.out.println("ok");
//        } else {
//            System.out.println("no");
//        }
        //Esconder barra de título padrão JFrame e JDialog.
//        this.setUndecorated(true);
    }
}

