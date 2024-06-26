import { useState, useEffect } from "react";
import ConvertBase64ToImage from "./ConvertBase64ToImage";
import "./styles.css";

const SeeCatalogue = () => {
    const [products, setProducts] = useState([])
    const [errorMessage, setErrorMessage] = useState(null)

    useEffect(() => {
        const consult = async () => {
            try {
                const response = await fetch("http://localhost:8080/api/v1/produtos")
                if (!response.ok) {
                    throw new Error();
                }
                const data = await response.json()
                setProducts(data)
            } catch (error) {
                setErrorMessage(error.message)
            }
        }
        consult()
    }, [])

    return (
        <div>
            <h2>Consultar catalogo</h2>
            <table id="products">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Descrição</th>
                        <th>Custo</th>
                        <th>Quantidades</th>
                        <th>Peça</th>
                    </tr>
                </thead>
                <tbody>
                    {products.map((product) => (
                        <tr key={product.id}>
                            <td>{product.id}</td>
                            <td>{product.descricao}</td>
                            <td>{product.custo}</td>
                            <td>{product.quantidadeNoEstoque}</td>
                            <td>
                                <img src={ConvertBase64ToImage(product.imagem)} alt="Imagem"/>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
            {errorMessage && (
              <p>Erro na consulta: {errorMessage}</p>
            )}
        </div>
    )
}

export default SeeCatalogue