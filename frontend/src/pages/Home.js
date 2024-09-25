import React from "react";
import "./Home.css";
import RegistrationForm from "../components/RegistrationForm";
import LoginForm from "../components/LoginForm";

const Home = () => {
  return (
    <div className="home-page">
      <div className="left-form">
        <RegistrationForm />
      </div>
      <div className="right-form">
        <LoginForm />
      </div>
    </div>
  );
};

export default Home;
