package Ex4e7;

import javax.swing.JOptionPane;

/**
 *
 * @author Priscila Butzke
 */
public class ex4e7 {

    public static void main(String[] args) {
        /* Uma empresa concederá um aumento de salário aos seus funcionários, variável de acordo com o cargo, 
conforme a tabela abaixo. Faça um algoritmo que leia o salário e o cargo de um funcionário e calcule 
o novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 40% de aumento. 
Mostre o salário antigo, o novo salário e a diferença

Código			Cargo			Percentual
-------------------------------------------------------------------------------
101				Gerente			10%
102				Engenheiro		20%
103				Técnico		        30%    */

        int num;
        double salarioAtual, salarioNovo, diferença;

        salarioAtual = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o sálario atual: "));
        num = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite o código de seu cargo conforme tabela:"
                + "\n101 Gerente"
                + "\n102 Engenheiro"
                + "\n103 Técnico "
                + "\n104 Outro"));

        switch (num) {
            case 101:
                salarioNovo = (salarioAtual * 0.10) + salarioAtual;
                diferença = salarioNovo - salarioAtual;
                JOptionPane.showMessageDialog(null, "Salário antigo: R$ " + salarioAtual
                        + "\n Salário novo: R$ " + salarioNovo
                        + "\nDiferença: R$ " + diferença);
                break;
            case 102:
                salarioNovo = (salarioAtual * 0.20) + salarioAtual;
                diferença = salarioNovo - salarioAtual;
                JOptionPane.showMessageDialog(null, "Salário antigo: R$ " + salarioAtual
                        + "\n Salário novo: R$ " + salarioNovo
                        + "\nDiferença: R$ " + diferença);
                break;
            case 103:
                salarioNovo = (salarioAtual * 0.30) + salarioAtual;
                diferença = salarioNovo - salarioAtual;
                JOptionPane.showMessageDialog(null, "Salário antigo: R$ " + salarioAtual
                        + "\n Salário novo: R$ " + salarioNovo
                        + "\nDiferença: R$ " + diferença);
                break;
            case 104:
                salarioNovo = (salarioAtual * 0.40) + salarioAtual;
                diferença = salarioNovo - salarioAtual;
                JOptionPane.showMessageDialog(null, "Salário antigo: R$ " + salarioAtual
                        + "\n Salário novo: R$ " + salarioNovo
                        + "\nDiferença: R$ " + diferença);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código digitado inválido");
        }
    }
}
