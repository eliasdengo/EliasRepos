using System;
using System.Data.SqlClient;
using System.Data;
namespace mywebsite
{
    public partial class Reg : System.Web.UI.Page
    {
        String Gender;
        SqlConnection conn = new SqlConnection(@"Data Source=.;Initial Catalog=learning;Integrated Security=True");

        protected void Page_Load(object sender, EventArgs e)
        {
            if (conn.State == ConnectionState.Open)
            {
                conn.Close();
            }
            conn.Open();

        }

        protected void btnregistor_Click(object sender, EventArgs e)
        {
                SqlCommand cmd = conn.CreateCommand();

                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "insert into Registration (fullname ,address,gender,phone,email,username ,password) values('" + txtfullname.Text + "','" + txtadd.Text + "','" + Gender + "','" + txtphone.Text + "','" + txtemail.Text + "','" + txtusername.Text + "','" + txtpassword.Text + "')";
                cmd.ExecuteNonQuery();

                Response.Write("<script>alert('user sucessfully registered')</script>");
                Response.Redirect("Login.aspx");

            
        }

        protected void txtmale_CheckedChanged(object sender, EventArgs e)
        {
            Gender = "Male";
        }

        protected void txtfemale_CheckedChanged(object sender, EventArgs e)
        {
            Gender = "Female";
        }

        protected void txtother_CheckedChanged(object sender, EventArgs e)
        {
            Gender = "Ohter";
        }
    }
}

