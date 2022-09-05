<%@ Page Language="C#" AutoEventWireup="true" CodeFile="personalDetail.aspx.cs" Inherits="personalDetail" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style1 {
            width: 29px;
            height: 204px;
        }
        .auto-style2 {
            width: 70px;
            height: 173px;
        }
        .auto-style3 {
            width: 29px;
            height: 20px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    <table class="auto-style2">
       <tr>
           <td class="auto-style3">
               <asp:Button ID="btndetail" runat="server" Text="personal Detail" />
           </td>
         
       </tr>
        <tr>
            <td>
                <asp:Label ID="id" runat="server" Text=""></asp:Label>
                <asp:Label ID="fname" runat="server" Text=""></asp:Label>
                <asp:Label ID="lname" runat="server" Text=""></asp:Label>
                <asp:Label ID="dob" runat="server" Text=""></asp:Label>
                <asp:Label ID="sex" runat="server" Text=""></asp:Label>
                <asp:Label ID="phone" runat="server" Text=""></asp:Label>
                <asp:Label ID="email" runat="server" Text=""></asp:Label>
                <asp:Label ID="edu" runat="server" Text=""></asp:Label>
                <asp:Label ID="religion" runat="server" Text=""></asp:Label>
                <asp:Label ID="country" runat="server" Text=""></asp:Label>
                <asp:Label ID="lang" runat="server" Text=""></asp:Label>
                <asp:Label ID="city" runat="server" Text=""></asp:Label>
                <asp:Label ID="house" runat="server" Text=""></asp:Label>
            </td>
           
        </tr>
    </table>
    </div>
    </form>
</body>
</html>
