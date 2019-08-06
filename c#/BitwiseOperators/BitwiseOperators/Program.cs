using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace BitwiseOperators
{
    class Program
    {
        static void Main(string[] args)
        {
            // Global Variable declaration

            b_status = int('1010', 2);
            b_up = int('0001', 2);
            b_down = int('0010', 2);
            b_right = int('0100', 2);
            b_left = int('1000', 2);

//#*************************************
// Have a look on bit reprasentation *
//# b3 b2 b1 b0 *
//# 1 0 1 0 *
//#*************************************

//Turn on perticular bit
        DES setOn(b):
        global b_down, b_right, b_up, b_status, b_left
            if (b == 0):
                b_status = b_status | b_up
            else if(b == 1):
                b_status = b_status | b_down
            else if(b == 2):
                b_status = b_status | b_right
            else if(b == 3):
                b_status = b_status | b_left
            else:
                print("Invalid input");
            return;
//#note u can do b_status = b_status | (b_up<<b)
//##############################################
//#Trun off perticular bit
            def setOff(b):
                global b_status, b_up;
                b_status = b_status & (b_up << b)
               return;
//#########################################
//#Flip the perticular bit
            def flip(b):
                global b_up, b_status;
                b_status = b_status ^ (b_up << b)
                return;

//#Inverting the all bits
            def invert():
                global b_status
                b_status = ~(b_status);
                return;
//#####################################
//#Check status of bit
            def testOn(b):
                global b_status, b_up

                return b_status & (b_up << b);

            //################################################
            //#****This is testing purpose*******************

            print("Before SetON b_status is :{}".format(bin(b_status)));
            setOn(2); //#calling function
            print("After SetON b_status is :{}".format(bin(b_status)));

            print("Before SetOff b_status is :{}".format(bin(b_status)));
            setOff(3); //#calling function
            print("After SetOff b_status is :{}".format(bin(b_status)));

            print("Before invert b_status is :{}".format(bin(b_status)));
            invert();//#calling function
            print("After invert b_status is :{}".format(bin(b_status)));

            print("Before flip b_status is :{}".format(bin(b_status)));
            flip(2);// #calling functio
            print("Before flip b_status is :{}".format(bin(b_status)));

            if testOn(1): //#calling function
                print("Bit is ON");
            else:
                print("Bit is OFF");
//#*************************************************

//sample out put:

            Before SetON b_status is :0b1010;
            After SetON b_status is :0b1110;
            Before SetOff b_status is :0b1110;
            After SetOff b_status is :0b1000;
            Before invert b_status is :0b1000;
            After invert b_status is :-0b1001;
            Before flip b_status is :-0b1001;
            Before flip b_status is :-0b1101;
            Bit is ON;
        }
    }
}
