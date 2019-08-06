<%@ Page Title="Welcome" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Contact.aspx.cs" Inherits="JohnQualitySharpening.Contact" %>
<%@ Register TagPrefix="uc" TagName="ContactForm" Src="ContactForm.ascx" %>
<asp:Content ID="Content" ContentPlaceHolderID="MainContent" runat="server">
    
    <br /><br />
    <h3 style="text-align:center">Contact Us</h3>
    <address style="text-align:center">
        Sunrise Drive<br />
        Lake of the Four Seasons, IN  46307<br />
        <abbr title="Phone">Ph:</abbr>
        219.746.5991
    </address>
  
    
	
    
    <h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Customer Data</h3>

    
	<uc:ContactForm ID="cf" runat="server"></uc:ContactForm>
	<asp:Button Text="Send" ID="BtnSend" runat="server" OnClick="BtnSend_Click" />
    
    
    
    <p>
		<asp:Label ID="lblOutput" runat="server"></asp:Label>
	</p>
    
    
    </asp:Content>
