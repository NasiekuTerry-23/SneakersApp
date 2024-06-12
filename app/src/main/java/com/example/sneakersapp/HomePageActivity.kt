package com.example.sneakersapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import com.example.sneakersapp.ui.theme.SneakersAppTheme

class HomePageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            HomePage()

        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun HomePage() {
    Scaffold(
//    topBar = {
//        CenterAlignedTopAppBar(
//            title = {
//                Text(text = "Top App Bar")
//            },
//            navigationIcon = {
//                IconButton(onClick = {}) {
//                    Icon(Icons.Filled.Home, "homeIcon")
//                }
//            },
//
//            )
//    },
content = {

     LazyColumn (
         modifier = Modifier
             .fillMaxSize()
             .background(Color(0xFF121212))
             .padding(20.dp)
     ) {
         item {
             Row(
                 modifier = Modifier
                     .padding(15.dp),

                 verticalAlignment = Alignment.CenterVertically
             ) {
                 Image(
                     painter = painterResource(id = R.drawable.pers),
                     contentDescription = "Profile Image",
                     modifier = Modifier
                         .width(60.dp)
                         .height(60.dp)
                         .clip(CircleShape)
                 )
                 Spacer(
                     modifier = Modifier
                         .width(14.dp)
                 )
                 Column {
                     Text(
                         text = "Good Morning",
                         color = Color.White,
                         fontSize = 18.sp,
                     )
                     Text(
                         text = "Njoro Kimani",
                         color = Color.White,
                         fontSize = 22.sp,
                         fontWeight = FontWeight.Bold,
                     )
                 }
                 Spacer(
                     modifier = Modifier
                         .weight(1f)
                 )

                 Icon(
                     painter = painterResource(id = R.drawable.noti),
                     contentDescription = "Notification",
                     tint = Color.White,
                 )
                 Spacer(
                     modifier = Modifier
                         .width(8.dp)
                 )
                 Icon(
                     painter = painterResource(id = R.drawable.fave),
                     contentDescription = "Notification",
                     tint = Color.White,
                 )
             }
             Column {
                 Row {
                     var search by remember {
                         mutableStateOf(TextFieldValue(""))
                     }
                     OutlinedTextField(
                         value = search,

                         leadingIcon = {
                             Icon(
                                 imageVector = Icons.Default.Search,
                                 contentDescription = "searchIcon",
                                 modifier = Modifier
                                     .padding(4.dp)
                                     .size(60.dp)
                             )
                         },
                         colors = OutlinedTextFieldDefaults.colors(
                             focusedContainerColor = Color.LightGray,
                             unfocusedContainerColor = Color.LightGray,
                         ),
                         onValueChange = { search = it },
                         label = { Text("Looking for shoes", color = Color.White) },
                         modifier = Modifier
                             .padding(10.dp)
                             .height(60.dp)
                             .width(300.dp),
                         shape = RoundedCornerShape(10.dp),


                         )
                     Spacer(
                         modifier = Modifier
                             .weight(1f)
                     )

                     Icon(
                         painter = painterResource(id = R.drawable.filter),
                         contentDescription = "Notification",
                         tint = Color.White,
                         modifier = Modifier
                             .border(1.dp, Color.LightGray, RoundedCornerShape(10.dp))
                             .size(50.dp)
                             //.background(Color.LightGray)
                             .align(Alignment.CenterVertically)
                             .clickable { }
                             .padding(10.dp),
                     )
                 }
             }
             Spacer(
                 modifier = Modifier
                     .height(10.dp)
             )

             Row {
                 Text(
                     text = "  Special Offers",
                     color = Color.White,
                     fontSize = 20.sp,
                     fontWeight = FontWeight.Bold
                 )
                 Spacer(
                     modifier = Modifier
                         .weight(1f)
                 )
                 Text(
                     text = "See All",
                     color = Color.White,
                     fontSize = 20.sp,
                     fontWeight = FontWeight.Bold
                 )
             }
             Spacer(
                 modifier = Modifier
                     .height(15.dp)
             )
             Card(
                 colors = CardDefaults.cardColors(Color(color = 0xffe56a08)),
                 shape = RoundedCornerShape(20.dp),
                 modifier = Modifier
                     .height(200.dp)
                     .fillMaxWidth(),
                 // elevation = CardDefaults.cardElevation(10.dp)
             ) {
                 Row(
                     modifier = Modifier.padding(16.dp),
                     verticalAlignment = Alignment.CenterVertically
                 ) {
                     Column {
                         Text(
                             text = "30% OFF",
                             color = Color.White,
                             fontSize = 30.sp,
                             fontWeight = FontWeight.Bold,
                         )
                         Text(
                             text = "Nike Air Jordan",
                             color = Color.White,
                             fontSize = 20.sp
                         )
                         Text(
                             text = "get discount for every",
                             color = Color.White,
                             fontSize = 15.sp
                         )
                         Text(
                             text = "order,only for today",
                             color = Color.White,
                             fontSize = 15.sp
                         )
                         Text(
                             text = "$399.00",
                             color = Color.White,
                             fontSize = 25.sp,
                             fontWeight = FontWeight.Bold,
                         )
                         Spacer(
                             modifier = Modifier
                                 .width(180.dp)
                         )
                     }
                     Image(
                         painter = painterResource(id = R.drawable.shoe),
                         contentDescription = "Nike Air Jordan",
                         modifier = Modifier
                             .padding(20.dp)
                             .size(150.dp),
                         contentScale = ContentScale.Crop
                     )
                 }
             }
             Spacer(
                 modifier = Modifier
                     .height(20.dp)
             )
             LazyRow(
                 horizontalArrangement = Arrangement.SpaceEvenly,
                 modifier = Modifier
                     .height(100.dp)
             ) {
                 item {
                     Column(
                         horizontalAlignment = Alignment.CenterHorizontally,
                         modifier = Modifier
                             .height(100.dp)
                     ) {
                         Card(
                             colors = CardDefaults.cardColors(Color(color = 0xffe56a08)),
                             shape = RoundedCornerShape(40.dp),
                             modifier = Modifier
                                 .height(80.dp)
                                 .width(150.dp),
                         ) {
                             Row(
                                 verticalAlignment = Alignment.CenterVertically,
                                 horizontalArrangement = Arrangement.SpaceBetween,
                                 modifier = Modifier
                                     .padding(16.dp)
                                     .fillMaxWidth()
                             ) {
                                 Box(

                                     modifier = Modifier
                                         .clip(CircleShape)
                                         .background(Color.White)
                                         .size(60.dp)

                                 ) {

                                     Icon(
                                         painter = painterResource(id = R.drawable.nike),
                                         contentDescription = "Nike Icon",
                                         modifier = Modifier
                                             .clip(CircleShape)
                                             .border(1.dp, Color.White, CircleShape)
                                             .padding(4.dp)
                                             .size(55.dp)
                                             .clickable { }
                                     )
                                 }
                                 Text(

                                     text = "Nike",
                                     fontSize = 25.sp,
                                     color = Color.White,
                                     fontFamily = FontFamily.SansSerif,
                                     fontStyle = FontStyle.Normal,
                                     fontWeight = FontWeight.SemiBold,
                                 )
                             }
                         }
                     }
                     Spacer(
                         modifier = Modifier
                             .width(15.dp)
                     )
                     Column(
                         horizontalAlignment = Alignment.CenterHorizontally,
                         modifier = Modifier
                             .height(100.dp)
                     ) {
                         Box(

                             modifier = Modifier
                                 .clip(CircleShape)
                                 .background(Color.White)
                                 .size(70.dp)
                         ) {
                             Icon(
                                 painter = painterResource(id = R.drawable.addidas),
                                 contentDescription = "Addidas Icon",
                                 modifier = Modifier
                                     .clip(CircleShape)
                                     .padding(2.dp)
                                     .size(65.dp)
                                     .clickable { }
                             )
                         }
                     }
                     Spacer(
                         modifier = Modifier
                             .width(20.dp)
                     )
                     Column(
                         horizontalAlignment = Alignment.CenterHorizontally,
                         modifier = Modifier
                             .height(100.dp)
                     ) {

                         Box(

                             modifier = Modifier
                                 .clip(CircleShape)
                                 .background(Color.White)
                                 .size(70.dp)


                         ) {
                             Icon(
                                 painter = painterResource(id = R.drawable.converse),
                                 contentDescription = "Converse Icon",
                                 modifier = Modifier

                                     .clip(CircleShape)
                                     //.border(1.dp, Color(0xffe56a08), CircleShape)
                                     .padding(4.dp)
                                     .size(65.dp)
                                     .clickable { }
                             )
                         }
                     }
                     Spacer(
                         modifier = Modifier
                             .width(15.dp)
                     )

                     Column(
                         horizontalAlignment = Alignment.CenterHorizontally,
                         modifier = Modifier
                             .height(100.dp)
                     ) {

                         Box(

                             modifier = Modifier
                                 .clip(CircleShape)
                                 .background(Color.White)
                                 .size(70.dp)
                         ) {

                             Icon(
                                 painter = painterResource(id = R.drawable.newbal),
                                 contentDescription = "NewBallCompany Icon",
                                 modifier = Modifier

                                     .clip(CircleShape)
                                     .size(65.dp)
                                     .padding(4.dp)
                                     .clickable { }
                             )
                         }
                     }
                 }
             }
             Spacer(
                 modifier = Modifier
                     .height(5.dp)
             )
             Row {
                 Text(
                     text = "  Most Popular",
                     color = Color.White,
                     fontSize = 20.sp,
                     fontWeight = FontWeight.Bold
                 )
                 Spacer(
                     modifier = Modifier
                         .weight(1f)
                 )
                 Text(
                     text = "See All",
                     color = Color.White,
                     fontSize = 20.sp,
                     fontWeight = FontWeight.Bold
                 )
             }
             Spacer(
                 modifier = Modifier
                     .height(10.dp)
             )
             Row {
                 Card(
                     colors = CardDefaults.cardColors(Color(color = 0xff273746)),
                     shape = RoundedCornerShape(20.dp),
                     modifier = Modifier
                         .height(230.dp)
                         .width(200.dp),
                     elevation = CardDefaults.cardElevation(4.dp)
                 ) {
                     Row(
                         modifier = Modifier.padding(16.dp),
                         verticalAlignment = Alignment.CenterVertically,
                         horizontalArrangement = Arrangement.SpaceBetween
                     ) {
                         Column {
                             Image(
                                 painter = painterResource(id = R.drawable.shoe1),
                                 contentDescription = "Nike Jordan",
                                 modifier = Modifier
                                     .padding(5.dp)
                                     .size(100.dp),
                                 contentScale = ContentScale.Crop
                             )
                             Row {
                                 Column {
                                     Text(
                                         text = "Best Seller",
                                         color = Color.White,
                                         fontSize = 20.sp,
                                         fontWeight = FontWeight.Normal,
                                     )
                                     Text(
                                         text = "Nike Jordan",
                                         color = Color.White,
                                         fontSize = 20.sp
                                     )

                                     Text(
                                         text = "$349.00",
                                         color = Color.White,
                                         fontSize = 25.sp,
                                         fontWeight = FontWeight.Bold,
                                     )
                                 }
                                 Spacer(
                                     modifier = Modifier
                                         .width(10.dp)
                                 )
                                 Column(
                                     horizontalAlignment = Alignment.End,
                                     verticalArrangement = Arrangement.SpaceEvenly,
                                 ) {
                                     Button(
                                         onClick = {
                                             // home.startActivity(Intent(home, HomePageActivity::class.java))
                                         },
                                         colors = ButtonDefaults.buttonColors(Color(color = 0xffe56a08)),
                                         shape = RoundedCornerShape(15.dp),
                                     ) {
                                         Text(
                                             text = "+",
                                             color = Color.White,
                                             fontSize = 35.sp,
                                             fontWeight = FontWeight.Bold,
                                         )
                                     }
                                 }
                             }
                         }
                     }
                 }
                 Spacer(
                     modifier = Modifier
                         .width(10.dp)
                 )

                 Card(
                     colors = CardDefaults.cardColors(Color(color = 0xff273746)),
                     shape = RoundedCornerShape(20.dp),
                     modifier = Modifier
                         .height(230.dp)
                         .width(200.dp),
                     elevation = CardDefaults.cardElevation(4.dp)
                 ) {
                     Row(
                         modifier = Modifier.padding(16.dp),
                         verticalAlignment = Alignment.CenterVertically,
                         horizontalArrangement = Arrangement.SpaceBetween
                     ) {
                         Column {
                             Image(
                                 painter = painterResource(id = R.drawable.shoe2),
                                 contentDescription = "Nike Jordan",
                                 modifier = Modifier
                                     .padding(5.dp)
                                     .size(100.dp),
                                 contentScale = ContentScale.Crop
                             )
                             Row {
                                 Column {
                                     Text(
                                         text = "Best Seller",
                                         color = Color.White,
                                         fontSize = 20.sp,
                                         fontWeight = FontWeight.Normal,
                                     )
                                     Text(
                                         text = "Nike Jordan",
                                         color = Color.White,
                                         fontSize = 20.sp
                                     )

                                     Text(
                                         text = "$349.00",
                                         color = Color.White,
                                         fontSize = 25.sp,
                                         fontWeight = FontWeight.Bold,
                                     )
                                 }
                                 Spacer(
                                     modifier = Modifier
                                         .width(10.dp)
                                 )
                                 Column(
                                     horizontalAlignment = Alignment.CenterHorizontally,
                                     verticalArrangement = Arrangement.Center,
                                 ) {
                                     Button(
                                         onClick = {
                                             // home.startActivity(Intent(home, HomePageActivity::class.java))
                                         },
                                         colors = ButtonDefaults.buttonColors(Color(color = 0xffe56a08)),
                                         shape = RoundedCornerShape(15.dp),
                                     ) {
                                         Text(
                                             text = "+",
                                             color = Color.White,
                                             fontSize = 35.sp,
                                             fontWeight = FontWeight.Bold,
                                         )
                                     }
                                 }
                             }
                         }
                     }
                 }
                 Spacer(
                     modifier = Modifier
                         .height(10.dp)
                 )
                 Row {
                     Card(
                         colors = CardDefaults.cardColors(Color(color = 0xff273746)),
                         shape = RoundedCornerShape(20.dp),
                         modifier = Modifier
                             .height(230.dp)
                             .width(200.dp),
                         elevation = CardDefaults.cardElevation(4.dp)
                     ) {
                         Row(
                             modifier = Modifier.padding(16.dp),
                             verticalAlignment = Alignment.CenterVertically,
                             horizontalArrangement = Arrangement.SpaceBetween
                         ) {
                             Column {
                                 Image(
                                     painter = painterResource(id = R.drawable.shoe1),
                                     contentDescription = "Nike Jordan",
                                     modifier = Modifier
                                         .padding(5.dp)
                                         .size(100.dp),
                                     contentScale = ContentScale.Crop
                                 )
                                 Row {
                                     Column {
                                         Text(
                                             text = "Best Seller",
                                             color = Color.White,
                                             fontSize = 20.sp,
                                             fontWeight = FontWeight.Normal,
                                         )
                                         Text(
                                             text = "Nike Jordan",
                                             color = Color.White,
                                             fontSize = 20.sp
                                         )

                                         Text(
                                             text = "$349.00",
                                             color = Color.White,
                                             fontSize = 25.sp,
                                             fontWeight = FontWeight.Bold,
                                         )
                                     }
                                     Spacer(
                                         modifier = Modifier
                                             .width(10.dp)
                                     )
                                     Column(
                                         horizontalAlignment = Alignment.End,
                                         verticalArrangement = Arrangement.SpaceEvenly,
                                     ) {
                                         Button(
                                             onClick = {
                                                 // home.startActivity(Intent(home, HomePageActivity::class.java))
                                             },
                                             colors = ButtonDefaults.buttonColors(Color(color = 0xffe56a08)),
                                             shape = RoundedCornerShape(15.dp),
                                         ) {
                                             Text(
                                                 text = "+",
                                                 color = Color.White,
                                                 fontSize = 35.sp,
                                                 fontWeight = FontWeight.Bold,
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

     }
 },
        bottomBar = {
            BotomBarrHome()
        }
    )
}

@Composable
fun BotomBarrHome() {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(
        elevation = 10.dp,
        backgroundColor = (Color(0xFF273746))

    ) {

        BottomNavigationItem(icon = {
            Icon(
                imageVector = Icons.Default.Home,
                "",
                tint = Color.White,
                modifier = Modifier
                    .size(30.dp)

            )
        },
            label = {
                Text(text = "Home",
                    color = Color.White
                ) },
            selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                "",
                tint = Color.White,
                modifier = Modifier
                    .size(30.dp)
            )
        },
            label = {
                Text(
                    text = "Cart",
                    color = Color.White
                ) },
            selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })

        BottomNavigationItem(icon = {
            Icon(
                imageVector = Icons.Default.Call,
                "",
                tint = Color.White,
                modifier = Modifier
                    .size(30.dp)
            )

        },
            label = {
                Text(
                    text = "Call",
                    color = Color.White

                ) }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person,
                "",
                tint = Color.White,
                modifier = Modifier
                    .size(30.dp)
            )
        },
            label = {
                Text(
                    text = "Profile",
                    color = Color.White
                ) }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })


    }
}




