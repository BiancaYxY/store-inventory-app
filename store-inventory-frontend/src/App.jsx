import { useState } from "react";
import "./App.css";

import CategoriiPage from "./pages/CategoriiPage";
import FurnizoriPage from "./pages/FurnizoriPage";
import ProdusePage from "./pages/ProdusePage";
import StocuriPage from "./pages/StocuriPage";

const TABS = [
    { key: "categorii", label: "Categorii" },
    { key: "furnizori", label: "Furnizori" },
    { key: "produse", label: "Produse" },
    { key: "stocuri", label: "Stocuri" },
];

export default function App() {
    const [tab, setTab] = useState("categorii");

    return (
        <div className="app">
            <h1>Inventar magazin</h1>

            <div className="tabs">
                {TABS.map((t) => (
                    <button
                        key={t.key}
                        onClick={() => setTab(t.key)}
                        className={`tabBtn ${tab === t.key ? "active" : ""}`}
                    >
                        {t.label}
                    </button>
                ))}
            </div>

            {tab === "categorii" && <CategoriiPage />}
            {tab === "furnizori" && <FurnizoriPage />}
            {tab === "produse" && <ProdusePage />}
            {tab === "stocuri" && <StocuriPage />}
        </div>
    );
}