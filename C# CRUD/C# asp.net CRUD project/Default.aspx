
<%@
    Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="mywebsite._Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    <table align="center">
        <tr>
            <td>
                First Name:
            </td>
            
            <td>
                <asp:TextBox ID="fname" runat="server"></asp:TextBox>
            </td>
        </tr>

         <tr>
            <td>
                Last Name:
            </td>
             
            <td>
                <asp:TextBox ID="lname" runat="server"></asp:TextBox>
            </td>
        </tr>  
        <tr>
            <td>
               DOB:
            </td>
            <td>
                <asp:TextBox ID="dob" runat="server" TextMode="Date"></asp:TextBox>
            </td>
        </tr>
        
         <tr>
            <td>
            Gender:
            </td>
            <td>
                <asp:RadioButton GroupName="user" ID="txtmale" runat="server" Text="Male" OnCheckedChanged="txtmale_CheckedChanged"/>
                 <asp:RadioButton  GroupName="user" ID="txtfemale" runat="server" Text="Female" OnCheckedChanged="txtfemale_CheckedChanged"/>
                 <asp:RadioButton  GroupName="user" ID="txtother" runat="server" Text="Other" OnCheckedChanged="txtother_CheckedChanged" />
              </td>
        </tr>
        
         <tr>
            <td>
                Phone:
            </td>
            <td>
                <asp:TextBox ID="phone" runat="server" TextMode="Number"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td>
                Email:
            </td>
            <td>
                <asp:TextBox ID="email" runat="server" TextMode="Email"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td>
               Education level:
            </td>
            <td>
                <asp:DropDownList ID="edu" runat="server">
                    <asp:ListItem>Secondary</asp:ListItem>
                    <asp:ListItem>College </asp:ListItem>
                    <asp:ListItem>Degree (BA)</asp:ListItem>
                    <asp:ListItem>Degree(BS)</asp:ListItem>
                    <asp:ListItem>Degree(MS)</asp:ListItem>
                    <asp:ListItem>Degree(PHD)</asp:ListItem>
                </asp:DropDownList>
            </td>
        </tr>
        <tr>
            <td>
                Religion:
            </td>
            <td>
                <asp:DropDownList ID="religion" runat="server">
                    <asp:ListItem>Chirstian</asp:ListItem>
                    <asp:ListItem>Musilem</asp:ListItem>
                    <asp:ListItem>Other</asp:ListItem>
                </asp:DropDownList>
            </td>
        </tr>
        <tr>
            <td>
                Coutry:
            </td>
            <td>
                <asp:DropDownList ID="country" runat="server">
                    <asp:ListItem>Country</asp:ListItem>
                    <asp:ListItem>America</asp:ListItem>
                    <asp:ListItem>Ethiopia</asp:ListItem>
                    <asp:ListItem>China</asp:ListItem>
                    <asp:ListItem>Poland</asp:ListItem>
                    <asp:ListItem>Coria</asp:ListItem>
                    <asp:ListItem>Japan</asp:ListItem>
                    <asp:ListItem>Brazil</asp:ListItem>
                    <asp:ListItem>London</asp:ListItem>
                </asp:DropDownList>
            </td>
        </tr>
        <tr>
            <td>
                Language:
            </td>
            <td>
             <asp:ListBox ID="lang" runat="server" Height="37px" Rows="2" SelectionMode="Multiple">
                 <asp:ListItem>Language</asp:ListItem>
                 <asp:ListItem>English</asp:ListItem>
                 <asp:ListItem>Amharic</asp:ListItem>
                 <asp:ListItem>Oromifa</asp:ListItem>
                 <asp:ListItem>Tigrena</asp:ListItem>
                 <asp:ListItem>Gammona</asp:ListItem>
                 <asp:ListItem>somalina</asp:ListItem>
                 <asp:ListItem>sidamina</asp:ListItem>
                 <asp:ListItem>Wolatina</asp:ListItem>
                 <asp:ListItem>Gambilina</asp:ListItem>
                 <asp:ListItem>Harerina</asp:ListItem>
                </asp:ListBox>
            </td>
        </tr>
         <tr>
            <td>
                City:
            </td>
            <td>
                <asp:TextBox ID="city" runat="server"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td>
                House No:
            </td>
            <td>
                <asp:TextBox ID="house" runat="server" ></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <asp:Button ID="Button1" runat="server" Text="Insert" OnClick="Button1_Click" />
                <asp:Button ID="Button2" runat="server" Text="Delete" OnClick="Button2_Click" />
                <asp:Button ID="Button3" runat="server" Text="Update" OnClick="Button3_Click" />
                <asp:Button ID="Button4" runat="server" Text="View" OnClick="Button4_Click" />
                <asp:Button ID="Button5" runat="server" Text="Search" OnClick="Button5_Click" />
                <asp:LinkButton ID="btnback" runat="server"  PostBackUrl="~/Login.aspx" OnClick="btnback_Click">Back</asp:LinkButton>
            </td>
        </tr>
        <br />
        <tr>
            <td colspan="2" align="center">Enter FName for Update :</td>
             <td>
                 <asp:TextBox ID="txtupdate" runat="server"></asp:TextBox></td>
        </tr>
    </table>

        <br />
        <asp:GridView ID="GridView1" runat="server" AutoGenerateSelectButton="True" OnSelectedIndexChanged="GridView1_SelectedIndexChanged"></asp:GridView>
    </div>
    </form>
</body>
</html>
