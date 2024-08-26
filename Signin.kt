@androidx.compose.runtime.Composable

fun password() {
    OutlinedTextField(
        value = password,
        onValueChange = { newText -> password = newText },
        label = { Text(text = stringResource(id = R.string.password) ,
            Modifier.alpha(0.6f),
            color = colorResource(id =  R.color.Gray),
            textAlign = TextAlign.Start)},
        modifier = Modifier
            .size(350.dp, 100.dp)
            .padding(top = 30.dp, start = 30.dp),
        visualTransformation = PasswordVisualTransformation(),


    )

}


