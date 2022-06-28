const BASE_URL = 'http://localhost:8080/api/tennis'

export const initGame = async (players) => {
    await fetch(`${BASE_URL}/init`, {
        method: 'POST', 
        headers: {
            'Content-type': 'application/json'
        }, 
        body: JSON.stringify(players)
    });
}