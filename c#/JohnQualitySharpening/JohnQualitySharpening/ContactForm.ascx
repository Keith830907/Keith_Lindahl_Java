<%@ Control Language="C#" AutoEventWireup="true" CodeBehind="ContactForm.ascx.cs" Inherits="JohnQualitySharpening.ContactForm" %>
    <table style="text-align:center">
		
		<tr style="text-align:center">
			<td style="text-align:center"><strong>CompanyName</strong></td>
			<td>
				<asp:TextBox runat="server" ID="txtCompanyName" />
			</td>
		</tr>
		<tr style="text-align:center">
			<td style="text-align:center"><strong>Address</strong></td>
			<td>
				<asp:TextBox runat="server" ID="txtAddress" />
			</td>
		</tr>
		<tr style="text-align:center">
			<td style="text-align:center"><strong>PhoneNumber</strong></td>
			<td>
				<asp:TextBox runat="server" ID="txtPhoneNumber" />
			</td>
		</tr>	
		    <tr style="text-align:center">
			<td style="text-align:center"><strong>Customer's Name</strong></td>
			<td>
				<asp:TextBox runat="server" ID="txtCustomerName" />
			</td>
		</tr>
			<tr style="text-align:center">
			<td style="text-align:center"><strong>Comments</strong></td>
			<td>
				<asp:TextBox runat="server" ID="txtComments" TextMode="MultiLine" />
			</td>
		</tr>
		
   </table>