<%@ Page Title="Welcome" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Contact.aspx.cs" Inherits="Quality.Contact" %>
<%@ Register TagPrefix="uc" TagName="ContactForm" Src="ContactForm.ascx" %>
<asp:Content ID="Content" ContentPlaceHolderID="MainContent" runat="server">
    
    <h2><%: Title %></h2>
    <h3>Contact Us</h3>
    <address>
        One Microsoft Way<br />
        Lake of the Four Seasons, IN  46307<br />
        <abbr title="Phone">Ph:</abbr>
        219.746.5991
    </address>
  
    
	
    
    <h3>Customer Data</h3>

    
	<uc:ContactForm ID="cf" runat="server"></uc:ContactForm>
	<asp:Button Text="Send" ID="btnSend" runat="server" OnClick="btnSend_Click" />
    
    <p>
		<asp:Label ID="lblOutput" runat="server"></asp:Label>
	</p>
</asp:Content>
