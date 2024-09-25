import React from "react";
import { useState } from "react";
import axios from "axios";

const RegistrationForm = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [sharedSecret, setSharedSecret] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post("http://localhost:8080/api/signup", {
        email,
        password,
        sharedSecret,
      });

      if (response.data.success) {
        alert("Compte créé avec succès");
      } else {
        alert("Erreur : " + response.data.message);
      }
    } catch (error) {
      console.error("Erreur lors de la création du compte", error);
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Inscription</h2>
      <div>
        <label htmlFor="email">Email :</label>
        <input
          type="email"
          id="email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          required
        />
      </div>
      <div>
        <label htmlFor="password">Mot de passe :</label>
        <input
          type="password"
          id="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
        />
      </div>
      <div>
        <label htmlFor="sharedSecret">Shared Secret :</label>
        <input
          type="text"
          id="sharedSecret"
          value={sharedSecret}
          onChange={(e) => setSharedSecret(e.target.value)}
          required
        />
      </div>
      <button type="submit">Envoyer</button>
    </form>
  );
};

export default RegistrationForm;
