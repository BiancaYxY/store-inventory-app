import { getFurnizori } from "../api.js";
import { useLoad } from "../hooks/useLoad.js";

export default function FurnizoriPage() {
    const { data, loading, error } = useLoad(getFurnizori);

    if (loading) return <p>Loading furnizori...</p>;
    if (error) return <p style={{ color: "crimson" }}>{error}</p>;

    return (
        <>
            <h2>Furnizori</h2>
            <table border="1" cellPadding="8">
                <thead>
                <tr>
                    <th>id</th>
                    <th>nume</th>
                    <th>oras</th>
                    <th>telefon</th>
                </tr>
                </thead>
                <tbody>
                {data.map((f) => (
                    <tr key={f.id}>
                        <td>{f.id}</td>
                        <td>{f.nume}</td>
                        <td>{f.oras}</td>
                        <td>{f.telefon}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </>
    );
}