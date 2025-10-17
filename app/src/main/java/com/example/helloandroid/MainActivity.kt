package com.example.helloandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text

import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.helloandroid.ui.theme.ElectricIndigo
import com.example.helloandroid.ui.theme.HelloAndroidTheme
import com.example.helloandroid.ui.theme.VividViolet
import com.example.helloandroid.ui.theme.black
import com.example.helloandroid.ui.theme.darkPurple
import com.example.helloandroid.ui.theme.grey
import com.example.helloandroid.ui.theme.greyDark
import com.example.helloandroid.ui.theme.ligthPurple
import com.example.helloandroid.ui.theme.white


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloAndroidTheme {

                MainScreen()
            }


        }


    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MainScreen() {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var passwordVisible by remember { mutableStateOf(false) }
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = {
                        Text("Login")
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.Black,
                        titleContentColor = Color.White
                    ),


                    )
            }
        ) { contentPadding ->
            Box(
                modifier = Modifier
                    .padding(contentPadding)
                    .fillMaxSize()
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                VividViolet,
                                ElectricIndigo.copy(alpha = 0.86f),
                                VividViolet.copy(alpha = 1f)
                            ),
                            start = Offset(150f, 400f),
                            end = Offset(Float.POSITIVE_INFINITY, 0f)
                        ),
                    )

            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 24.dp, end = 16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(
                            text = "Don't have account?",
                            style = MaterialTheme.typography.bodyLarge.copy(color = white)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        OutlinedButton(

                            border = BorderStroke(
                                width = 0.5.dp, brush = Brush.horizontalGradient(
                                    colors = listOf(
                                        white,
                                        white.copy(alpha = 0.1f)


                                    )
                                )
                            ),
                            shape = RoundedCornerShape(
                                16.dp
                            ),
                            onClick = {}) {
                            Text(
                                "Get started", modifier = Modifier.padding(
                                    top = 6.dp,
                                    bottom = 6.dp,
                                    start = 0.dp,
                                    end = 0.dp
                                ), style = MaterialTheme.typography.titleSmall.copy(color = white)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(32.dp))
                    Text(
                        "Q Agency",
                        style = MaterialTheme.typography.titleLarge.copy(color = white)
                    )

                    Box(
                        modifier = Modifier
                            .padding(
                                top = 32.dp
                            )
                    ) {
                        Box(

                            modifier = Modifier
                                .padding(
                                    start = 16.dp, end = 16.dp
                                )
                                .fillMaxWidth()
                                .height(78.dp)
                                .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                                .background(white.copy(alpha = 0.4f))
                        )
                        Box(

                            modifier = Modifier
                                .padding(
                                    top = 12.dp
                                )
                                .fillMaxSize()
                                .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                                .background(white), contentAlignment = Alignment.TopCenter
                        ) {

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "Welcome back!",
                                    modifier = Modifier.padding(top = 32.dp),
                                    style = MaterialTheme.typography.titleLarge
                                )

                                Spacer(modifier = Modifier.height(32.dp))

                                OutlinedTextField(
                                    modifier = Modifier
                                        .padding(start = 16.dp, end = 16.dp)
                                        .border(
                                            BorderStroke(width = 0.5.dp, color = grey),
                                            shape = RoundedCornerShape(17.dp),

                                            )
                                        .fillMaxWidth(),

                                    placeholder = {
                                        Text(
                                            "Enter email or username",
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = greyDark
                                        )
                                    },
                                    shape = RoundedCornerShape(17.dp),
                                    onValueChange = {
                                        username = it
                                    }, value = username, singleLine = true,
                                    leadingIcon = {
                                        Icon(
                                            painter = painterResource(R.drawable.ic_user),
                                            contentDescription = "icon user",
                                            tint = greyDark
                                        )
                                    },
                                    textStyle = MaterialTheme.typography.bodyLarge

                                )

                                Spacer(modifier = Modifier.height(24.dp))


                                OutlinedTextField(
                                    modifier = Modifier
                                        .padding(start = 16.dp, end = 16.dp)
                                        .border(
                                            BorderStroke(width = 0.5.dp, color = grey),
                                            shape = RoundedCornerShape(17.dp),

                                            )
                                        .fillMaxWidth(),
                                    placeholder = {
                                        Text(
                                            "Enter password",
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = greyDark
                                        )
                                    },
                                    shape = RoundedCornerShape(17.dp),
                                    onValueChange = {
                                        password = it
                                    },
                                    value = password,
                                    singleLine = true,
                                    leadingIcon = {
                                        Icon(
                                            painter = painterResource(R.drawable.ic_lock),
                                            contentDescription = "icon user",
                                            tint = greyDark
                                        )
                                    },
                                    textStyle = MaterialTheme.typography.bodyLarge,
                                    visualTransformation = if (passwordVisible)
                                        VisualTransformation.None
                                    else
                                        PasswordVisualTransformation(),

                                    trailingIcon = {
                                        var image = if (passwordVisible) {
                                            painterResource(R.drawable.hide)
                                        } else {
                                            painterResource(R.drawable.visible)
                                        }

                                        IconButton(
                                            onClick = {
                                                passwordVisible = !passwordVisible
                                            },
                                            modifier = Modifier.size(24.dp),

                                            ) {
                                            Icon(
                                                tint = greyDark,
                                                painter = image,
                                                contentDescription = if (passwordVisible) "hide" else "visible"

                                            )
                                        }

                                    }

                                )


                                Spacer(modifier = Modifier.height(24.dp))


                                Text(
                                    "Forget your password?",
                                    style = MaterialTheme.typography.bodyLarge,
                                    textAlign = TextAlign.Start,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 16.dp)
                                )


                                Spacer(modifier = Modifier.height(32.dp))

                                Button(
                                    onClick = {},
                                    shape = RoundedCornerShape(
                                        17.dp,
                                    ),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 16.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = ligthPurple,
                                        contentColor = darkPurple
                                    )
                                ) {
                                    Text(
                                        "Login",
                                        style = MaterialTheme.typography.titleMedium,
                                        modifier = Modifier.padding(12.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.height(44.dp))

                                OrContinueWithTaperedLines()

                                Spacer(modifier = Modifier.height(44.dp))



                                OutlinedButton(
                                    onClick = {},
                                    shape = RoundedCornerShape(17.dp),
                                    modifier = Modifier
                                        .padding(horizontal = 16.dp)
                                        .fillMaxWidth()
                                        .border(
                                            BorderStroke(
                                                width = 0.5.dp,
                                                color = grey,
                                            ),
                                            shape = RoundedCornerShape(17.dp)
                                        )
                                ) {


                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.Center
                                    ) {
                                        Image(
                                            painterResource(R.drawable.google),
                                            contentDescription = "google",
                                            modifier = Modifier.size(24.dp),
                                        )

                                        Text(
                                            "Siqn in with Google",
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = black,
                                            modifier = Modifier.padding(
                                                vertical = 12.dp,
                                                horizontal = 4.dp
                                            )
                                        )
                                    }

                                }


                                Spacer(modifier = Modifier.height(15.dp))



                                OutlinedButton(
                                    onClick = {},
                                    shape = RoundedCornerShape(17.dp),
                                    modifier = Modifier
                                        .padding(horizontal = 16.dp)
                                        .fillMaxWidth()
                                        .border(
                                            BorderStroke(
                                                width = 0.5.dp,
                                                color = grey,
                                            ),
                                            shape = RoundedCornerShape(17.dp)
                                        )
                                ) {


                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.Center
                                    ) {
                                        Image(
                                            painterResource(R.drawable.facebook),
                                            contentDescription = "google",
                                            modifier = Modifier.size(24.dp),
                                        )

                                        Text(
                                            "Siqn in with facebook",
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = black,
                                            modifier = Modifier.padding(
                                                vertical = 12.dp,
                                                horizontal = 4.dp
                                            )
                                        )
                                    }

                                }
                            }


                        }

                    }

                }


            }


        }
    }


    @Composable
    fun OrContinueWithTaperedLines() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Canvas(
                modifier = Modifier
                    .weight(1f)
                    .height(2.dp)
            ) {
                val width = size.width
                val height = size.height


                drawPath(
                    path = Path().apply {
                        moveTo(0f, height / 8)
                        lineTo(width, 0f)
                        lineTo(width, height)
                        close()
                    },
                    color = Color.LightGray
                )
            }

            Text(
                text = "Or continue with",
                color = Color.LightGray,
               style = MaterialTheme .typography.titleSmall,
                modifier = Modifier.padding(horizontal = 12.dp)
            )



            Canvas(
                modifier = Modifier
                    .weight(1f)
                    .height(2.dp)
            ) {
                val width = size.width
                val height = size.height

                drawPath(
                    path = Path().apply {
                        moveTo(width, height / 8)
                        lineTo(0f, 0f)
                        lineTo(0f, height)
                        close()
                    },
                    color = Color.LightGray

                )

            }
        }

    }
}



