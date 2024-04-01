import { useState, useEffect } from "react";
import "./styles.css";

const SeeCatalogue = () => {
  const [products, setProducts] = useState([]);
  const [errorMessage, setErrorMessage] = useState([]);

  useEffect(() => {
    const consult = async () => {
      try {
        const response = await fetch("");
        const data = await response.json();
        setProducts(data);
      } catch (error) {
        setErrorMessage(error);
        console.log(errorMessage);
      }
    };
    consult();
  }, []);

  return (
    <div className="catalogue">
      <h3>Consultar catalogo</h3>
      {JSON.stringify(products)}
    </div>
  );
};

export default SeeCatalogue;
