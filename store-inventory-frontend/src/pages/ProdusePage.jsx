import { getProduse } from "../api.js";
import { useLoad } from "../hooks/useLoad.js";

export default function ProdusePage() {
    const { data, loading, error } = useLoad(getProduse);

    if (loading) return <p>Loading produse...</p>;
    if (error) return <p style={{ color: "crimson" }}>{error}</p>;

    return (
        <>
            <h2>Produse</h2>
            <table border="1" cellPadding="8">
                <thead>
                <tr>
                    <th>id</th>
                    <th>nume</th>
                    <th>pret</th>
                    <th>categorie_id</th>
                    <th>furnizor_id</th>
                    <th>reducere</th>
                </tr>
                </thead>
                <tbody>
                {data.map((p) => (
                    <tr key={p.id}>
                        <td>{p.id}</td>
                        <td>{p.nume}</td>
                        <td>{p.pret}</td>
                        <td>{p.categorie_id}</td>
                        <td>{p.furnizor_id}</td>
                        <td>{p.reducere ?? "-"}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </>
    );
}