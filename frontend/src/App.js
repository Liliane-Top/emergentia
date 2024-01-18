import React, { Component } from "react";
import "bootstrap/dist/css/bootstrap-grid.min.css";
import Homepage from "./components/homepage/Homepage";
import NavBar from "./components/fixed/NavBar";
import Footer from "./components/fixed/Footer";
import {BrowserRouter as Router, Route} from "react-router-dom";
import "./App.css";
import About from "./components/aboutpage/About";
import Blog from "./components/blogpostpage/Blog";
import Contact from "./components/contactpage/Contact";



class App extends Component {
    render() {
        return (
            <Router>
                <div className="app">
                    <Route path='*' component={NavBar}/>
                    <Route path='*' component={Footer}/>
                    <Route path='/' component={Homepage}/>
                    <Route path='/blog' component={Blog}/>
                    <Route path='/about' component={About}/>
                    <Route path='/contact' component={Contact}/>
                </div>
        </Router>
        )
    }

}

export default App;
