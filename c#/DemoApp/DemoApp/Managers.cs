using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DemoApp
{
    class Managers : Employee
    {
        private String CostCenter;
        private String Supervisor;

        public Managers() { }

        public Managers(string costCenter, string supervisor)
        {
            CostCenter = costCenter;
            Supervisor = supervisor;
        }
    }
}
