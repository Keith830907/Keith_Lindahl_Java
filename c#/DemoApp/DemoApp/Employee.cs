using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DemoApp
{
    class Employee 
    {
        private String firstName;
        private String lastName;
        private String streetAddress;
        private String city;
        private String state;
        private String zip;

        public Employee() {}

        public Employee(string firstName, string lastName, string streetAddress, string city, string state, string zip)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.streetAddress = streetAddress;
            this.city = city;
            this.state = state;
            this.zip = zip;
        }

    

        private void Employee_Load(object sender, EventArgs e)
        {

        }
    }
}
