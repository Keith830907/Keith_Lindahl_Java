<%@ Page Title="" Language="C#" MasterPageFile="~/Private/Site1.Master" AutoEventWireup="true" CodeBehind="Data.aspx.cs" Inherits="JohnQualitySharpening.Private.Data" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head1" runat="server">


</asp:Content>

<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
  
    <form id="form2"  runat="server" style=" background-color:#e2e6e9;  margin-left: auto; margin-right: auto; width:95%; height:auto; max-height:100%;">
       
  
  
    </form>

</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent1" runat="server">
    
     <form id="form1" runat="server" style=" background-color:#e2e6e9;  margin-left: auto; margin-right: auto; width:95%; height:auto; max-height:100%;">
          
         <div>
             <asp:HiddenField ID="hfID" runat="server" />
             <table style="background-color:#c5ccd3;">
                 <tr style="background-color:#c5ccd3;">
                    <td>
                        <asp:Label Text="ID" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtID" runat="server" />
                    </td>
                </tr>
                 <tr style="background-color:#c5ccd3;">
                    <td>
                        <asp:Label Text="NextCall" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtNextCall" runat="server" />
                    </td>
                </tr>
                 <tr>
                    <td>
                        <asp:Label Text="Customer" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtCustomer" runat="server" />
                    </td>
                </tr>
                 <tr>
                    <td>
                        <asp:Label Text="Address" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtAddress" runat="server" />
                    </td>
                </tr>
                 <tr>
                    <td>
                        <asp:Label Text="City" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtCity" runat="server" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <asp:Label Text="State" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtState" runat="server" />
                    </td>
                </tr>
                 <tr>
                    <td>
                        <asp:Label Text="Zip" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtZip" runat="server" />
                    </td>
                </tr>
                 <tr>
                    <td>
                        <asp:Label Text="PhoneNumber" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtPhoneNumber" runat="server" />
                    </td>
                </tr>
                 <tr>
                    <td>
                        <asp:Label Text="CALLER" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtCALLER" runat="server" />
                    </td>
                </tr>
                 <tr>
                    <td>
                        <asp:Label Text="LastCall" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtLastCall" runat="server" />
                    </td>
                </tr>
                 <tr>
                    <td>
                        <asp:Label Text="TimeSinceLastCall" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtTimeSinceLastCall" runat="server" />
                    </td>
                </tr>
                 <tr>
                    <td>
                        <asp:Label Text="CustomerContact" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtCustomerContact" runat="server" />
                    </td>
                </tr>
                 <tr>
                    <td>
                        <asp:Label Text="Comments" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtComments" runat="server" />
                    </td>
                </tr>
                 <tr>
                    <td></td>
                    <td colspan="2" >
                        <asp:Button Text="Save" ID="btnSave" runat="server" OnClick="btnSave_Click" />
                        <asp:Button Text="Delete" ID="btnDelete" runat="server" OnClick="btnDelete_Click" />
                        <asp:Button Text="Clear" ID="btnClear" runat="server" OnClick="btnClear_Click" />
                    </td>
                </tr>
                 <tr>
                    <td></td>
                    <td colspan="2">
                        <asp:Label Text="" ID="lblSuccessMessage" runat="server" ForeColor="Green" />
                    </td>
                </tr>
                 <tr>
                    <td></td>
                    <td colspan="2">
                        <asp:Label Text="" ID="lblErrorMessage" runat="server" ForeColor="Red" />
                    </td>
                </tr>
             </table>
             <br/ /><br/ />
              <iframe id="Location" width="250" height="250" src="http://maps.google.com/maps?q=<%# Server.UrlEncode(string.Format("{0} {1} {2} {3}", Eval("Address"), Eval("City"), Eval("State"), Eval("Zip"))) %>&amp;output=embed"></iframe>
                <br/ />
           
    <script src="https://maps.googleapis.com/maps/api/jsvv=3.exp&sensor=false&libraries=places"></script>
            <script>
            function init() {
                var input = document.getElementById('txtLocation');
                var autocomplete = new google.maps.places.Autocomplete(input);
            }

            google.maps.event.addDomListener(window, 'load', init);
        </script>
            
             <table>
             <tr>
                    <td>
                        <asp:Label Text="Location" runat="server" />
                    </td>
                    <td colspan="2" style="background-color:#c5ccd3;">
                        <asp:TextBox ID="txtLocation" runat="server" />
                    </td>
                </tr>
            </table>

            <asp:GridView ID="Mapview" runat="server" AutoGenerateColumns="false" style="background-color:#c5ccd3;" >
                 
                <Columns>
                <asp:BoundField DataField="Location" HeaderText="Location" />
                </Columns>
                
            </asp:GridView>
        
            
             <br/ />
             <asp:GridView ID="Clientview" runat="server" AutoGenerateColumns="false" OnRowDataBound="GridView1_RowDataBound" style="background-color:#c5ccd3;" >
                 <Columns>
                     <asp:BoundField DataField="ID" HeaderText="ID" />
                     <asp:BoundField DataField="NextCall" HeaderText="NextCall" />
                     <asp:BoundField DataField="Customer" HeaderText="Customer" />
                     <asp:BoundField DataField="Address" HeaderText="Address" />
                     <asp:BoundField DataField="City" HeaderText="City" />
                     <asp:BoundField DataField="State" HeaderText="State" />
                     <asp:BoundField DataField="Zip" HeaderText="Zip" />
                     <asp:BoundField DataField="PhoneNumber" HeaderText="PhoneNumber" />
                     <asp:BoundField DataField="CALLER" HeaderText="CALLER" />
                     <asp:BoundField DataField="LastCall" HeaderText="LastCall" />
                     <asp:BoundField DataField="TimeSinceLastCall" HeaderText="TimeSinceLastCall" />
                     <asp:BoundField DataField="CustomerContact" HeaderText="CustomerContact" />
                     <asp:BoundField DataField="Comments" HeaderText="Comments" />
                     <asp:TemplateField>
                         <ItemTemplate>
                             <asp:LinkButton Text="Select" ID="lnkSelect" CommandArgument='<%# Eval("ID") %>' runat="server" OnClick="lnkSelect_OnClick"   style="background-color: #008CBA; text-decoration:none; color: white;" />
                             <asp:LinkButton Text="lnkMAP" ID ="lnkMap"   CommandArgument='<%# Eval("ID") %>'  runat="server" OnClick="lnkMap_OnClick" style="background-color: #008CBA; text-decoration:none; color: white;" />
                         </ItemTemplate>
                     </asp:TemplateField>
                 </Columns>
             </asp:GridView>
        </div>

                       

                    
    </form>            
                           
     <button style="display: block; margin-left: auto; margin-right: auto; width:95%; height:auto; max-height:100%;" onclick="topFunction()" id="myBtn" title="Go to top">Back To Top Of Page</button>
   <style>
    #myBtn:hover {
  background-color: #66ff33;
}
       #MAP {
           width: 548px;
       }
   </style>
<script>
// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    document.getElementById("myBtn").style.display = "block";
  } else {
    document.getElementById("myBtn").style.display = "none";
  }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}
</script>
     <footer>
                <a href="https://www.facebook.com/qualityjohn" style=" text-decoration:none; color: green; text-align:center; display: block; margin-left: auto; margin-right: auto; width:100%; height:auto; max-height:100%;">CLICK HERE TO GO TO--- www.facebook.com/qualityjohn ---PLEASE LIKE US</a><br />
                <p style="text-align:center;">&copy; <%: DateTime.Now.Year %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; --- John's Quality Sharpening ---</p>
            </footer>
   
</asp:Content>
