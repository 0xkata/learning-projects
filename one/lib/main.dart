import 'package:flutter/material.dart';
import 'package:one/screens/home_screen.dart';

void main() {
  runApp(MaterialApp(
    title: 'Flutter Demo',
    theme: ThemeData(
      primarySwatch: Colors.red,
    ),
    home: const HomeScreen(),
  ));
}
