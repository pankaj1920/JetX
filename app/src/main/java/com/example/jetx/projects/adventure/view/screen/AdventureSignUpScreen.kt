package com.example.jetx.projects.adventure.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetx.R
import com.example.jetx.projects.big_cart.view.custom_view.SpaceHeight
import com.example.jetx.projects.big_cart.view.custom_view.SpaceWidth
import com.example.jetx.ui.theme.advButtonDisableColor
import com.example.jetx.ui.theme.advInputColor
import com.example.jetx.ui.theme.advPrimaryColor
import com.example.jetx.ui.theme.advSocialBgColor
import com.example.jetx.ui.theme.adventureGrey


@Composable
fun AdventureSignUpScreen() {

    var name by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(text = "Sign Up", fontSize = 28.sp, fontWeight = FontWeight.Bold)
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_adv_close),
                contentDescription = "Close"
            )
        }

        SpaceHeight(height = 20.dp)

        Text(
            text = "Sign Up to enjoy delicious food at home and also get 50% discount on your first order.",
            fontSize = 16.sp, color = adventureGrey,
            modifier = Modifier.padding(end = 30.dp)
        )

        SpaceHeight(height = 30.dp)
        Text(text = "Name", fontSize = 14.sp, fontWeight = FontWeight.Medium)
        SpaceHeight(height = 15.dp)
        TextField(
            value = name, onValueChange = { name = it },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                backgroundColor = advInputColor
            ),
            placeholder = {
                Text(text = "Eg: Joes Rabik", color = adventureGrey)
            }

        )

        SpaceHeight(height = 30.dp)
        Text(text = "Email", fontSize = 14.sp, fontWeight = FontWeight.Medium)
        SpaceHeight(height = 15.dp)
        TextField(value = email, onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                backgroundColor = advInputColor
            ),
            placeholder = {
                Text(text = "xyz@gmail.com", color = adventureGrey)
            })

        SpaceHeight(height = 30.dp)
        Text(text = "Password", fontSize = 14.sp, fontWeight = FontWeight.Medium)
        SpaceHeight(height = 15.dp)
        TextField(
            value = password, onValueChange = { password = it },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                backgroundColor = advInputColor
            ),
            placeholder = {
                Text(text = "Enter Password", color = adventureGrey)
            },
            trailingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_adv_password_on),
                    contentDescription = "Password On",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                )
            }
        )

        SpaceHeight(height = 70.dp)

        Button(
            onClick = {}, enabled = false, colors = ButtonDefaults.buttonColors(
                backgroundColor = advPrimaryColor,
                disabledBackgroundColor = advButtonDisableColor
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Sign Up", color = Color.White, fontWeight = FontWeight.SemiBold)
        }

        SpaceHeight(height = 50.dp)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Divider(modifier = Modifier.width(100.dp), thickness = 1.dp, color = adventureGrey)
            SpaceWidth(width = 10.dp)
            Text(
                text = "Also Sign Up With",
                color = adventureGrey,
                fontSize = 12.sp,
                fontWeight = FontWeight.W500
            )
            SpaceWidth(width = 10.dp)
            Divider(modifier = Modifier.width(100.dp), thickness = 1.dp, color = adventureGrey)
        }

        SpaceHeight(height = 40.dp)
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Image(
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .background(color = advSocialBgColor, shape = RoundedCornerShape(10.dp))
                        .padding(10.dp),
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = "Google"
                )
                SpaceWidth(width = 20.dp)

                Image(
                    painter = painterResource(id = R.drawable.ic_facebook),
                    contentDescription = "Facebook",
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .background(color = advSocialBgColor, shape = RoundedCornerShape(10.dp))
                        .padding(10.dp)
                )
                SpaceWidth(width = 20.dp)
                Image(
                    painter = painterResource(id = R.drawable.ic_apple),
                    contentDescription = "Apple",
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .background(color = advSocialBgColor, shape = RoundedCornerShape(10.dp))
                        .padding(10.dp)
                )


            }

            Text(text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Black, fontWeight = FontWeight.Medium)) {
                    append("Already have an account : ")
                }
                withStyle(
                    style = SpanStyle(
                        color = advPrimaryColor,
                        fontWeight = FontWeight.Medium
                    )
                ) {
                    append("Sign In")
                }
            })


        }

    }
}


@Preview(showBackground = true)
@Composable
fun AdventureSignUpPreview() {
    AdventureSignUpScreen()
}