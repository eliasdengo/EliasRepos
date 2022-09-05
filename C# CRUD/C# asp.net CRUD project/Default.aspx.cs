using System;
using System.Data;
using System.Data.SqlClient;

namespace mywebsite
{
    /*   string fname1 = null;
        string dob1 = null;
        string lname1 = null;
        string gender1 = null;
        string phone1 = null;
        string email1 = null;
        string edu1 = null;
        string religion1 = null;
        string country1 = null;
        string lang1 = null;
        string city1 = null;
        string house1 = null;
*/
    public partial  class _Default : System.Web.UI.Page
    {
        String Gender;
     
        SqlConnection con = new SqlConnection(@"Data Source=.;Initial Catalog=learning;Integrated Security=True");
       

        protected void Page_Load(object sender, EventArgs e)
        {
            if (con.State == ConnectionState.Open)
            {

                con.Close();
            }
            con.Open();
        }
        protected void Button1_Click(object sender, EventArgs e)
        {
           
            SqlCommand cmd = con.CreateCommand();
            cmd.CommandType = CommandType.Text;
          
            cmd.CommandText = "insert into Table1(firstname,lastname,dob,sex,phone,email,eucation,religion,country,lang,city,houseno) values(@fname1,@lname1,@dob1,@gender1,@phone1,@email1,@edu1,@religion1,@country1,@lang1,@city1,@house1)";
      
            cmd.Parameters.AddWithValue("@fname1", SqlDbType.NVarChar ).Value=fname.Text;
            cmd.Parameters.AddWithValue("@lname1", SqlDbType.NVarChar).Value=lname.Text;
            cmd.Parameters.AddWithValue("@dob1", SqlDbType.Date).Value=dob.Text;
          //  cmd.Parameters.AddWithValue("@gender1", SqlDbType.NVarChar).Value = Gender;
            if (Gender == null)
            {

                cmd.Parameters.AddWithValue("@gender1", SqlDbType.NVarChar).Value = DBNull.Value;
            }
            else
            {
                cmd.Parameters.AddWithValue("@gender1", SqlDbType.NVarChar).Value = Gender;
            }
            cmd.Parameters.AddWithValue("@phone1",SqlDbType.Int).Value=phone.Text;
            cmd.Parameters.AddWithValue("@email1", SqlDbType.NVarChar).Value=email.Text;
            cmd.Parameters.AddWithValue("@edu1", SqlDbType.NVarChar).Value=edu.Text;
            cmd.Parameters.AddWithValue("@religion1", SqlDbType.NVarChar).Value=religion.Text;
            cmd.Parameters.AddWithValue("@country1", SqlDbType.NVarChar).Value=country.Text;
            cmd.Parameters.AddWithValue("@lang1", SqlDbType.NVarChar).Value=lang.Text;
            cmd.Parameters.AddWithValue("@city1", SqlDbType.NVarChar).Value=lang.Text;
            cmd.Parameters.AddWithValue("@house1", SqlDbType.NVarChar).Value=house.Text;
            cmd.ExecuteNonQuery();
            
            fname.Text = "";
            city.Text = "";
            disp_data();
        }

        public void disp_data()
        {
            SqlCommand cmd = con.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "select * from Table1";
            cmd.ExecuteNonQuery();
            DataTable dt = new DataTable();
            SqlDataAdapter sda = new SqlDataAdapter(cmd);
            sda.Fill(dt);
            GridView1.DataSource = dt;
            GridView1.DataBind();
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            SqlCommand cmd = con.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "delete from Table1 where firstname='" + fname.Text + "'";
            cmd.ExecuteNonQuery();
            fname.Text = "";
            disp_data();
        }

        protected void Button3_Click(object sender, EventArgs e)
        {
            SqlCommand cmd = con.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "update Table1 set firstname='" + fname.Text + "',lastname='" + lname.Text + "',dob='" + dob.Text + "',sex='" + Gender + "',phone='" + phone.Text + "',email='" + email.Text + "',eucation='" + edu.SelectedValue + "',religion='" + religion.SelectedValue + "',country='" + country.SelectedValue + "',lang='" + lang.SelectedValue + "',city='" + city.Text + "',houseno='" + house.Text + "' where Id='" + txtupdate.Text + "'";
            cmd.ExecuteNonQuery();

            fname.Text = "";
            
            city.Text = "";

            disp_data();

        }

        protected void Button4_Click(object sender, EventArgs e)
        {
            disp_data();
        }

        protected void GridView1_SelectedIndexChanged(object sender, EventArgs e)
        {
            fname.Text = GridView1.SelectedRow.Cells[2].Text;
            lname.Text = GridView1.SelectedRow.Cells[3].Text;
            city.Text = GridView1.SelectedRow.Cells[4].Text;
            txtupdate.Text = GridView1.SelectedRow.Cells[1].Text;

        }

        protected void btnback_Click(object sender, EventArgs e)
        {
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

        protected void Button5_Click(object sender, EventArgs e)
        {
            SqlCommand cmd = con.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "select * from Table1 where Id='" + txtupdate.Text + "'  ";
            cmd.ExecuteNonQuery();
             DataTable dt = new DataTable();
            SqlDataAdapter sda = new SqlDataAdapter(cmd);
            sda.Fill(dt);
            GridView1.DataSource = dt;
            GridView1.DataBind();
        }
    }
}