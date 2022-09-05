using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.SessionState;

public partial class personalDetail : System.Web.UI.Page
{
    SqlConnection conn = new SqlConnection(@"Data Source=.;Initial Catalog=learning;Integrated Security=True");
    protected void Page_Load(object sender, EventArgs e)
    {

        if (conn.State == ConnectionState.Open)
        {

            conn.Close();
        }
        conn.Open();

        var user =Session["user"];
        var pass = Session["pass"];
        DataTable dt = new DataTable();
        SqlCommand cmd = conn.CreateCommand();
        cmd.CommandType = CommandType.Text;
        cmd.CommandText = "SELECT Id,firstname,lastname,dob ,sex,phone,email,eucation,religion,country,lang,city,houseno FROM personalinfo where  username= '"+user+"' and pass= '"+pass+"' ";
        SqlDataAdapter sqlDa = new SqlDataAdapter(cmd);
        sqlDa.Fill(dt);

        if (dt.Rows.Count>0) {
            id.Text = " id:" + dt.Rows[0]["Id"].ToString();
            fname.Text = "FirstName:" + dt.Rows[0]["firstname"].ToString();
            lname.Text = "LastName:" + dt.Rows[0]["lastname"].ToString();
            dob.Text = " DOB:" + dt.Rows[0]["dob"].ToString();
            sex.Text = "Sex:" + dt.Rows[0]["sex"].ToString();
            phone.Text = "Phone:" + dt.Rows[0]["phone"].ToString();
            email.Text = " Email:" + dt.Rows[0]["email"].ToString();
            edu.Text = "Education:" + dt.Rows[0]["eucation"].ToString();
             religion.Text = "\n Religion:" + dt.Rows[0]["religion"].ToString();
            country.Text = "Country:" + dt.Rows[0]["country"].ToString();
            lang.Text = "Language:" + dt.Rows[0]["lang"].ToString();
            city.Text = "City:" + dt.Rows[0]["city"].ToString();
            house.Text=  "Houseno:" + dt.Rows[0]["houseno"].ToString();
        }

    }


    protected void btndetail_Click(object sender, EventArgs e)
    {
       
    }
}