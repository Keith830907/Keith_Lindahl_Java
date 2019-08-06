<%@ Page Title="LoginPage" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="About.aspx.cs" Inherits="Quality.Login" %>
<%@ Register TagPrefix="uc" TagName="LoginForm" Src="LoginForm.ascx" %>
<asp:Content ID="LoginContent" ContentPlaceHolderID="LoginContent" runat="server">

<!DOCTYPE html>
     <h2><%: Title %></h2>
      <header style="background-color:#c5ccd3; height: 200px">
    <h2 style="text-align:center"><%: Title %></h2>
    </header>
   
    <uc:LoginForm ID="lg" runat="server"></uc:LoginForm>
    <asp:Button Text="Send" ID="btn2Send" runat="server" OnClick="btn2Send_Click" />
    
    <p>
		<asp:Label ID="logOutput" runat="server"></asp:Label>
	</p>


</asp:Content>