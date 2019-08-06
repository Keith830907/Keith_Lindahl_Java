using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleDisplayMessage
{
    class Program
    {
        static void Main(string[] args)
        {   //turns background blue and text white but not full bg just outlining of the text.
            Console.BackgroundColor = ConsoleColor.Blue;
            Console.ForegroundColor = ConsoleColor.White;

            //ask for a name
            Console.WriteLine("\nWhat is your name? ");//with breakpoint here console won't even begin

            //stor name in a variable
            var name = Console.ReadLine();//breakpoint here the console pops up but you cannot type a response

            //get date and time and store it in a variable
            var date = DateTime.Now;

            //display to pay the message
            Console.WriteLine($"\nHello, {name}, on {date:d} at {date:t}!\nWelcome to the Software Development Company!!!");//Breakpoint here you can type your name and then the program stops

            Console.WriteLine("\nDo You like Programming:Enter yes or no: ");
            var answer = Console.ReadLine();//breakpoint here gets you to do you like programming yes or no but you cannot type
         
           if (answer.ToLower() == "yes")//allows you to enter a response of yes or no here at breakpoint
            {
                Console.BackgroundColor = ConsoleColor.Green;
                Console.ForegroundColor = ConsoleColor.White;
                Console.WriteLine("\nWelcome aboard!!! You will be a great fit");
            } if (answer.ToLower() == "no")
            {
                Console.BackgroundColor = ConsoleColor.Red;
                Console.ForegroundColor = ConsoleColor.White;
                Console.WriteLine("\nAH HUMBUG!!!");
            }
           
            //switch to white on red for exit instructions
            Console.BackgroundColor = ConsoleColor.White;
            Console.ForegroundColor = ConsoleColor.Red;

            //create a way to exit easily and not until you enter a key
            Console.Write("\nPress any key to exit...");//at breakpoint gives you the response to what you entered 
            Console.ReadKey(true);
            Console.Clear();//breakpoint here takes you to the end but won't let you press any key to exit
        }
    }
}
