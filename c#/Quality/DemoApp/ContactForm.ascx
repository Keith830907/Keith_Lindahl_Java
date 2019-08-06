<%@ Control Language="C#" AutoEventWireup="true" CodeBehind="ContactForm.ascx.cs" Inherits="Quality.ContactForm" %>
    <table>
		
		<tr>
			<td><strong>CompanyName</strong></td>
			<td>
				<asp:TextBox runat="server" ID="txtCompanyName" />
			</td>
		</tr>
		<tr>
			<td><strong>Address</strong></td>
			<td>
				<asp:TextBox runat="server" ID="txtAddress" />
			</td>
		</tr>
		<tr>
			<td><strong>PhoneNumber</strong></td>
			<td>
				<asp:TextBox runat="server" ID="txtPhoneNumber" />
			</td>
		</tr>	
		<tr>
			<td><strong>Customer's Name</strong></td>
			<td>
				<asp:TextBox runat="server" ID="txtCustomerName" />
			</td>
		</tr>
			<tr>
			<td><strong>Comments</strong></td>
			<td>
				<asp:TextBox runat="server" ID="txtComments" TextMode="MultiLine" />
			</td>
		</tr>
		
   </table>