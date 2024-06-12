package com.example.sneakersapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sneakersapp.ui.theme.SneakersAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Login()

        }
    }
}


@Preview(showBackground = true)
@Composable
fun Login(){

    val home = LocalContext.current

    Box(
        modifier = Modifier.fillMaxWidth()

    ) {

        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.back1),
            contentDescription = null,
            contentScale = ContentScale.Crop,

            )

        Column (

            modifier = Modifier
                .padding(60.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

            ){

            Image(
                modifier = Modifier
                    .size(250.dp)
                    .padding(10.dp)
                    .clip(RoundedCornerShape(2.dp)),
                painter = painterResource(id = R.drawable.logo1),
                contentDescription = null
            )
            Spacer(
                modifier = Modifier
                    .height(8.dp)
            )
            Text(
                text = "Nikie Shoe Collection",
                color = Color.Black,
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                )
            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )
            Text(
                text = "Login",
                fontSize = 40.sp,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold
            )
            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )
            Text(
                text = "Come with your UserID",
                fontSize = 20.sp,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )
            Text(
                text = "For easy, efficient and secure login",
                fontSize = 12.sp,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )
            var name by remember{
                mutableStateOf(TextFieldValue(""))
            }
            Column {
                OutlinedTextField(
                    value = name,
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.White,
                        focusedBorderColor = Color.White,
                        unfocusedLabelColor = Color.White,
                        focusedLabelColor = Color.White,
                        ),
                    onValueChange = { name = it },
                    label = { Text(text = "Name") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(30.dp),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Person,
                            tint = Color.Black,
                            contentDescription = "personIcon")
                    }
                )
            }
            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )
            var email by remember{
                mutableStateOf(TextFieldValue(""))
            }
            Column {
                OutlinedTextField(
                    value = email,
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.White,
                        focusedBorderColor = Color.White,
                        unfocusedLabelColor = Color.White,
                        focusedLabelColor = Color.White,
                        ),
                    onValueChange = { email = it },
                    label = { Text(text = "Email") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(30.dp),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email,
                            tint = Color.Black,
                            contentDescription = "emailIcon")
                    }
                )
            }
            Spacer(
                modifier = Modifier
                    .height(5.dp)
            )
            var password by remember{
                mutableStateOf(TextFieldValue(""))
            }
            Column {
                OutlinedTextField(
                    value = password,
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.White,
                        focusedBorderColor = Color.White,
                        unfocusedLabelColor = Color.White,
                        focusedLabelColor = Color.White,
                        ),
                    onValueChange = { password = it },
                    label = { Text(text = "Password") },
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(30.dp),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock,
                            tint = Color.Black,
                            contentDescription = "lockIcon")
                    }
                )
            }
            Spacer(
                modifier = Modifier
                    .height(5.dp)

            )
            Button(
                onClick = {
                    home.startActivity(Intent(home, HomePageActivity::class.java))

                },
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(30.dp)
            ) {
                Text(
                    text = "Login" ,
                    fontSize = 15.sp,
                    color = Color.Black,
                    )
            }
            Spacer(
                modifier = Modifier
                    .height(5.dp)
            )
            Text(
                text = "Don't Have An Account?",
                fontSize = 15.sp,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold
            )
            Spacer(
                modifier = Modifier
                    .height(5.dp)
            )
            Button(

                onClick = {
                    home.startActivity(Intent(home, RegisterActivity::class.java))
                },
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(30.dp)
            ) {
                Text(
                    text = "Register" ,
                    fontSize = 15.sp,
                    color = Color.Black,
                    )
            }
            Spacer(
                modifier = Modifier
                    .height(5.dp)

            )
            Text(
                text = "Forgot Password?",
                fontSize = 15.sp,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold,
            )
        }
    }
}