using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Data;

public partial class Login : System.Web.UI.Page
{
    SqlConnection conn = new SqlConnection(@"Data Source=.;Initial Catalog=learning;Integrated Security=True");
    protected void Page_Load(object sender, EventArgs e)
    {
        error.Visible = false;
       
       
    }

    protected void btnlogin_Click(object sender, EventArgs e)
    {
        try
        {
            string uid = txtname.Text;
            string pass = txtpass.Text;
            conn.Open();
            string qry = "select * from Registration where username='" + uid + "' and password='" + pass + "'";
            SqlCommand cmd = new SqlCommand(qry, conn);
            SqlDataReader sdr = cmd.ExecuteReader();
            if (sdr.Read())
            {
                Response.Write("<script language=javascript>alert('Login Sucess......!!');</script>");
             //   Session["user"] = txtname.Text;
               // Session["pass"] = txtpass.Text;
                Response.Redirect("Default.aspx");
             ///   Response.Redirect("personalDetail.aspx");
                Session.RemoveAll();
            }
            else
            {
                error.Visible = true;

                Response.Write("<script language=javascript>alert('please insert correct username or password ......!!');</script>");
            }
            if (remember.Checked) {
                HttpCookie co = new HttpCookie(txtname.Text,txtpass.Text);
                co.Expires = DateTime.Now.AddMonths(1);
                Response.Cookies.Add(co);
            }
            conn.Close();
        }
        catch (Exception ex)
        {
            Response.Write(ex.Message);
        }
    }

} 
        

    
