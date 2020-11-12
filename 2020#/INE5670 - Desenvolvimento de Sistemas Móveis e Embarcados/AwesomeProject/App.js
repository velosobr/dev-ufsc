import React from 'react';
import {createAppContainer} from 'react-navigation';
import {createStackNavigator} from 'react-navigation-stack';
import AlunosScreen from './Alunos'

 
import HomeScreen from './Home'
 

const MainNavigator = createStackNavigator({
  Home: {screen: HomeScreen},
  Alunos: {screen: AlunosScreen},
}); 


const App = createAppContainer(MainNavigator);
export default App;