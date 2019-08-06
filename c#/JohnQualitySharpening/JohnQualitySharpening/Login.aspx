<%@ Page Title="LoginPage" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="About.aspx.cs" Inherits="JohnQualitySharpening.LoginView" %>

<asp:Content ID="Content" ContentPlaceHolderID="MainContent" runat="server">

    <!DOCTYPE html>
     
    
      <br /><br />
      <header style="background-color:#c5ccd3; height: 200px">
    <h2 style="text-align:center"><%: Title %></h2>
    </header>
   
    <br />
   
    <asp:Login ID="Login1" runat="server"  BackColor="#F7F6F3" BorderColor="#E6E2D8" BorderPadding="4" BorderStyle="Solid" BorderWidth="1px" Font-Names="Verdana" Font-Size="0.8em" ForeColor="#333333" Height="535px" Width="348px" CreateUserText="Register as a new user" CreateUserUrl="~/Register.aspx">
          <InstructionTextStyle Font-Italic="True" ForeColor="Black" />
          <LoginButtonStyle BackColor="#FFFBFF" BorderColor="#CCCCCC" BorderStyle="Solid" BorderWidth="1px" Font-Names="Verdana" Font-Size="0.8em" ForeColor="#284775" />
          <TextBoxStyle Font-Size="0.8em" />
          <TitleTextStyle BackColor="#5D7B9D" Font-Bold="True" Font-Size="0.9em" ForeColor="White" />
    </asp:Login>
       <asp:LoginStatus ID="LoginStatus1" runat="server" LoginText="You are Logged out!!!" LogoutText="You are Logged in!!!Welcome <asp:LoginName; runat=" server="" />
<br /><br />
    
     
    <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Go To Database" Width="248px" />
    <asp:LoginStatus ID="LoginStatus2" runat="server" />
</asp:Content>