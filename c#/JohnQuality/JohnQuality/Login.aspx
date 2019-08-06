<%@ Page Title="LoginPage" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="About.aspx.cs" Inherits="JohnQuality.Login" %>

<asp:Content ID="Content" ContentPlaceHolderID="MainContent" runat="server">

<!DOCTYPE html>
     <h2><%: Title %></h2>
      <header style="background-color:#c5ccd3; height: 200px">
    <h2 style="text-align:center"><%: Title %>
          </h2>
    </header>
   
  

 <asp:Login ID="Login1" runat="server" Width="752px"></asp:Login><br /><br />
    <asp:CreateUserWizard ID="CreateUserWizard1" runat="server">
        <WizardSteps>
            <asp:CreateUserWizardStep ID="CreateUserWizardStep1" runat="server">
            </asp:CreateUserWizardStep>
            <asp:CompleteWizardStep ID="CompleteWizardStep1" runat="server">
            </asp:CompleteWizardStep>
        </WizardSteps>
    </asp:CreateUserWizard>
    
  


</asp:Content>