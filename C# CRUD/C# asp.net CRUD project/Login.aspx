<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Login.aspx.cs" Inherits="Login" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style1 {
            width: 320px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    <table style="margin:auto; align-content:center;border:5px,solid,black;">
        <tr>
            <td>
                UserName:
            </td>
            <td class="auto-style1">
                <asp:TextBox ID="txtname" runat="server"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="txtname" ErrorMessage="UserName is empty" ForeColor="Red"></asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr>
            <td>
                Password:
            </td>
            <td class="auto-style1">
                <asp:TextBox ID="txtpass" runat="server" TextMode="Password" ></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ControlToValidate="txtpass" ErrorMessage="Password is empty" ForeColor="Red"></asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr>
            <td>

            </td>
            <td class="auto-style1">
                <asp:Button ID="btnlogin" runat="server" Text="Login" OnClick="btnlogin_Click" />
            </td>
        </tr>
        <tr>
            
            <td>

            </td>
            <td>
                <asp:CheckBox ID="remember" runat="server" Text="Remember Me" />
            </td>
        </tr>
        <tr>
            <td>

            </td>
            <td class="auto-style1">
                <asp:Label ID="error" runat="server"  ForeColor="Red"></asp:Label>
            </td>
        </tr>
         <tr>
            <td>
                if npt registor you have to registor ?
            </td>
            <td class="auto-style1">
                <asp:HyperLink ID="linktoregistration" runat="server" NavigateUrl="~/Reg.aspx">registration</asp:HyperLink>
            </td>
        </tr>
    </table>
    </div>
    </form>
</body>
</html>
