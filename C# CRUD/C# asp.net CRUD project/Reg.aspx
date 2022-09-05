<%@
     Page Language="C#" AutoEventWireup="true" CodeFile="Reg.aspx.cs" Inherits="mywebsite.Reg" %>

<!DOCTYPE html>
<script runat="server">


</script>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">

    <title></title>
    <style type="text/css">
        .auto-style1 {
            height: 26px;
            width: 171px;
        }
        .auto-style2 {
            width: 516px;
        }
        .auto-style3 {
            height: 26px;
            width: 516px;
        }
        .auto-style4 {
            width: 171px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    <table align="center">
        <tr>
            <td class="auto-style4">Full Name:</td>
             <td class="auto-style2">
                 <asp:TextBox ID="txtfullname" runat="server"></asp:TextBox>

                 <asp:RequiredFieldValidator ID="rfv1" runat="server" ControlToValidate="txtfullname" ErrorMessage="FullName is empty" ForeColor="Red"></asp:RequiredFieldValidator>

             </td>
        </tr>

         <tr>
            <td class="auto-style4">Address:</td>
             <td class="auto-style2">
                 <asp:TextBox ID="txtadd" runat="server"></asp:TextBox>

                 <asp:RequiredFieldValidator ID="rfv2" runat="server" ControlToValidate="txtadd" ErrorMessage="Address is empty" ForeColor="Red"></asp:RequiredFieldValidator>

             </td>
        </tr>

         <tr>
            <td class="auto-style4">Gender:</td>
             <td class="auto-style2">
                 <asp:RadioButton GroupName="user" ID="txtmale" runat="server" Text="Male" OnCheckedChanged="txtmale_CheckedChanged"/>
                 <asp:RadioButton  GroupName="user" ID="txtfemale" runat="server" Text="Female" OnCheckedChanged="txtfemale_CheckedChanged"/>
                 <asp:RadioButton  GroupName="user" ID="txtother" runat="server" Text="Other" OnCheckedChanged="txtother_CheckedChanged" />
             </td>
        </tr>
         <tr>
            <td class="auto-style4">Phone:</td>
             <td class="auto-style2">
                 <asp:TextBox ID="txtphone" runat="server"></asp:TextBox>

                 <asp:RequiredFieldValidator ID="rfv4" runat="server" ControlToValidate="txtphone" ErrorMessage="Phone is empty" ForeColor="Red"></asp:RequiredFieldValidator>
                 <asp:RegularExpressionValidator ID="RegularExpressionValidator2" runat="server" ControlToValidate="txtphone" ErrorMessage="Invalid Phone" ForeColor="#0000CC" ValidationExpression="\d{10}"></asp:RegularExpressionValidator>

             </td>
        </tr>

         <tr>
            <td class="auto-style4">E-mail:</td>
             <td class="auto-style2">
                 <asp:TextBox ID="txtemail" runat="server"></asp:TextBox>

                 <asp:RequiredFieldValidator ID="rfv5" runat="server" ControlToValidate="txtemail" ErrorMessage="Email is empty" ForeColor="Red"></asp:RequiredFieldValidator>
                 <asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" ControlToValidate="txtemail" ErrorMessage="Invalid Email " ForeColor="#0000CC" ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"></asp:RegularExpressionValidator>

             </td>
        </tr>

         <tr>
            <td class="auto-style1">UserName:</td>
             <td class="auto-style3">
                 <asp:TextBox ID="txtusername" runat="server" ></asp:TextBox>

                 <asp:RequiredFieldValidator ID="rfv6" runat="server" ControlToValidate="txtusername" ErrorMessage="UName is empty" ForeColor="Red"></asp:RequiredFieldValidator>

             </td>
        </tr>

         <tr>
            <td class="auto-style1">Password:</td>
             <td class="auto-style3">
                 <asp:TextBox ID="txtpassword" runat="server" TextMode="Password" ></asp:TextBox>

                 <asp:RequiredFieldValidator ID="rfv7" runat="server" ControlToValidate="txtpassword" ErrorMessage="Password is empty" ForeColor="Red"></asp:RequiredFieldValidator>

             </td>
        </tr>
        <tr>
            <td class="auto-style1">Re-Type Password:</td>
             <td class="auto-style3">
                 <asp:TextBox ID="repass" runat="server" TextMode="Password" ></asp:TextBox>

                 <asp:RequiredFieldValidator ID="rfv81" runat="server" ControlToValidate="repass" ErrorMessage="Re-Password is empty" ForeColor="Red"></asp:RequiredFieldValidator>

                 <asp:CompareValidator ID="CompareValidator1" runat="server" ControlToCompare="txtpassword" ControlToValidate="repass" ErrorMessage="Not same password" ForeColor="#000099"></asp:CompareValidator>

             </td>
        </tr>

         <tr>
             <td class="auto-style4">

             </td>
             <td colspan="3" class="auto-style2">
                 <asp:Button ID="btnregistor" runat="server" Text="Registor" OnClick="btnregistor_Click" />

             </td>
        </tr>
  
             <td class="auto-style4">
                 <asp:Label ID="lblback" runat="server" Text="Would you like back to login page ?" Font-Bold="True" Font-Italic="True" ForeColor="Blue" />
             </td>
             <td class="auto-style2">
               
                 <asp:HyperLink ID="linkgogin" runat="server" ToolTip="click back to login" NavigateUrl="~/Login.aspx">Login</asp:HyperLink>
             </td>
        </tr>

    </table>
    </div>
    </form>
</body>
</html>
