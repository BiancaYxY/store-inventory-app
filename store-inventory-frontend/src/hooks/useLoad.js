import { useEffect, useState } from "react";

export function useLoad(loaderFn) {
    const [data, setData] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState("");

    useEffect(() => {
        let cancelled = false;

        async function run() {
            setLoading(true);
            setError("");
            try {
                const res = await loaderFn();
                if (!cancelled) setData(res);
            } catch (e) {
                if (!cancelled) setError(e?.message ?? "Eroare");
            } finally {
                if (!cancelled) setLoading(false);
            }
        }

        run();
        return () => { cancelled = true; };
    }, [loaderFn]);

    return { data, loading, error };
}