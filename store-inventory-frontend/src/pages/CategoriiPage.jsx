import { getCategorii } from "../api";
import { useLoad } from "../hooks/useLoad";

export default function CategoriiPage() {
    const { data, loading, error } = useLoad(getCategorii);

    if (loading) return <p>Loading categorii...</p>;
    if (error) return <p style={{ color: "crimson" }}>{error}</p>;

    return (
        <>
            <h2>Categorii</h2>
            <table border="1" cellPadding="8">
                <thead>
                <tr>
                    <th>id</th>
                    <th>nume</th>
                </tr>
                </thead>
                <tbody>
                {data.map((c) => (
                    <tr key={c.id}>
                        <td>{c.id}</td>
                        <td>{c.nume}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </>
    );
}