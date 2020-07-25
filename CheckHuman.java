package checkhuman;
import java.util.Scanner;
public class CheckHuman {
    Scanner input = new Scanner(System.in);
    //ATRIBUTOS
    private int  number1;
    private int  number2;
    private boolean isHuman = false;

    //MÉTODOS ESPECIAIS

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }

    //MÉTODOS

    public void sumTest(int number1,int number2) {
        this.setNumber1(number1);
        this.setNumber2(number2);
        int correctAnswer = (this.getNumber1()+this.getNumber2());

        System.out.print("Insira o resultado dessa expressao "+(this.getNumber1())+"+"+(this.getNumber2())+" | ");
        int answer = input.nextInt();

        if(answer == correctAnswer) {
            System.out.println("HUMANO");
            this.setHuman(true);
        }

        while(answer != correctAnswer) {
            System.out.print("Insira o resultado dessa expressao "+(this.getNumber1())+"+"+(this.getNumber2())+" | ");
            int nextAnswers = input.nextInt();

            if(nextAnswers == correctAnswer) {
                System.out.println("HUMANO");
                this.setHuman(true);
                break;

            }

        }
    }
}
