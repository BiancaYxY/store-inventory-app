export const API_BASE = "http://localhost:8080";

async function handle(res) {
    if (!res.ok) {
        const text = await res.text();
        throw new Error(text || `HTTP ${res.status}`);
    }
    return res.json();
}

export async function getCategorii() {
    return handle(await fetch(`${API_BASE}/categorii`));
}

export async function getFurnizori() {
    return handle(await fetch(`${API_BASE}/furnizori`));
}

export async function getProduse() {
    return handle(await fetch(`${API_BASE}/produse`));
}

export async function getStocuri() {
    return handle(await fetch(`${API_BASE}/stocuri`));
}