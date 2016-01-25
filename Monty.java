/*
 *@author D.Whelan
 *13/12/2014
 * Monty.java
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class Monty {

    private int user_door;
    private int open_door;
    private int prize_door;
    private Random ran;
    private double stay = 0.0;
    private double swich = 0.0;
    private int counter;

    public Monty(){
        user_door = 0;
        open_door = 0;
        ran = new Random();
        prize_door = ran.nextInt(3)+ 1;
        swich=0;
        stay=0;
        counter=0;
        }


    public void setUser_door(int door){
        user_door = door;
    }

    public void compute(){

//first question
    counter= Integer.parseInt(JOptionPane.showInputDialog(null,"How many times would you like to play the game?"));

        for(int round = 0; round < counter; round++){
            prize_door = ran.nextInt(3) + 1;
            user_door = ran.nextInt(3) + 1;
            if(prize_door == user_door){
                stay++;
            }else{
                swich++;
            }
        }

        double success1 = 100 * (stay/counter);
        double success2 = 100 * (swich/counter);

//Second question
    setUser_door(Integer.parseInt(JOptionPane.showInputDialog(null, "Select the door 1, 2 or 3")));

    if (user_door > 3 || user_door < 0) {

    }

		else{
			if(user_door == 1){
				if(prize_door == 2){
				open_door = 3;
				}
				else{
				open_door= 2;
				}
		}

			else if(user_door == 2){
				if(prize_door == 3){
				open_door = 1;
				}
				else{
				open_door= 3;
				}
			}

				else if(user_door == 3){
					if(prize_door == 2){
					open_door = 1;
				}
					else{
					open_door= 2;
					}
			}

//User Input Yes or No
        char userReply = JOptionPane.showInputDialog(null,"You selected door number " + user_door + "\nBehind door number " + open_door + " there is a goat! \n" + "Would you like to switch y or n? ").charAt(0);


//If statement with nested while statements for user input
        if (userReply == 'y'){
            if(user_door == 2){
                if(open_door == 3){
                    user_door = 1;
                }
                else{
                    user_door = 3;
                }
            }
            else if(user_door == 3){
                if(open_door == 2){
                    user_door = 1;
                }
                else{
                    user_door = 2;
                }
            }
            else if(user_door == 1){
                if(open_door == 2){
                    user_door = 3;
                }
                else{
                    user_door = 2;
                }
            }
        }

// end edit

        JOptionPane.showMessageDialog(null,"The prize is behind door number " + prize_door);

    //win or lose
        if(user_door == prize_door){
            JOptionPane.showMessageDialog(null, "Congratulations!\nYou won the game!" + "\nThe total number of games is "+counter+"\nThe wins by switching " + swich +"\nThe wins with a staying " + stay);
        } else{
                JOptionPane.showMessageDialog(null,"Sorry  :'(\n You lost." + "\nThe total number of games is "+counter+"\nThe wins by switching " + swich +"\nThe wins by staying " + stay);
            }
        }

   }

   public double getSwitc(){
   return swich;
   }

   public double getStay(){
    return stay;
   }
}
