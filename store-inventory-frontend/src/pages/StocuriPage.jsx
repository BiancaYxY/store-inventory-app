import { getStocuri } from "../api.js";
import { useLoad } from "../hooks/useLoad.js";

export default function StocuriPage() {
    const { data, loading, error } = useLoad(getStocuri);

    if (loading) return <p>Loading stocuri...</p>;
    if (error) return <p style={{ color: "crimson" }}>{error}</p>;

    return (
        <>
            <h2>Stocuri</h2>
            <table border="1" cellPadding="8">
                <thead>
                <tr>
                    <th>id</th>
                    <th>produs_id</th>
                    <th>cantitate</th>
                </tr>
                </thead>
                <tbody>
                {data.map((s) => (
                    <tr key={s.id}>
                        <td>{s.id}</td>
                        <td>{s.produs_id}</td>
                        <td>{s.cantitate}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </>
    );
}