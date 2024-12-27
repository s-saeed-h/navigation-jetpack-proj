package com.example.navigationjetpack

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = {
                            Text("Aplication")

                        },
                        colors = TopAppBarDefaults.topAppBarColors(
                            containerColor = Color.Cyan
                        ),

                        //modifier = Modifier.size(100.dp,100.dp)
                    )
                },
                content = {


                    SetUi()


                },
                bottomBar = {
                    CostomBottomNav()
                }

            )

        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @Composable
    fun SetUi() {
        Row(
            modifier = Modifier
                .padding(top = 100.dp)

                .horizontalScroll(
                    rememberScrollState())
                ,
           verticalAlignment = Alignment.CenterVertically
        ) {


            Card {
                Column(
                              horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(R.drawable.ax1),
                        contentDescription = null,
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                    )
                    Text(
                        "قیمت جنس",
                        fontSize = 26.sp
                    )
                }
            }

            Card {
                Column(
                 //    modifier = Modifier.padding(30.dp) ,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(R.drawable.ax1),
                        contentDescription = null,
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                    )
                    Text(
                        "قیمت جنس",
                        fontSize = 26.sp
                    )
                }
            }

            Card {
                Column(
                   //modifier = Modifier.padding(30.dp) ,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(R.drawable.ax1),
                        contentDescription = null,
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                    )
                    Text(
                        "قیمت جنس",
                        fontSize = 26.sp
                    )
                }
            }

            Card {
                Column(

                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(R.drawable.ax1),
                        contentDescription = null,
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                    )
                    Text(
                        "قیمت جنس",
                        fontSize = 26.sp
                    )
                }
            }
        }
    }

    @Composable
    fun CostomBottomNav() {
        BottomAppBar {
            val items = listOf("Profile", "Home", "Settings")
            val iconItem = listOf(Icons.Filled.AccountBox, Icons.Filled.Home, Icons.Filled.Build)
            var selectedItem by remember {
                mutableStateOf(1)
            }
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedItem == index,
                        onClick = { selectedItem = index },
                        icon = {
                            Icon(
                                iconItem[index],
                                contentDescription = "saeed"
                            )
                        },
                        label = { Text(item) },
                        colors = NavigationBarItemColors(
                            selectedTextColor = Color.Black,
                            unselectedTextColor = Color.DarkGray,
                            unselectedIconColor = Color.Black,
                            disabledIconColor = Color.Blue,
                            disabledTextColor = Color.White,
                            selectedIconColor = Color.Green,
                            selectedIndicatorColor = Color.Gray,
                        )
                    )

                }
            }
        }
    }
}