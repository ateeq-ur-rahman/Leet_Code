import requests
from bs4 import BeautifulSoup

def reveal_message(doc_url):
    # Download published Google Doc page
    response = requests.get(doc_url)
    response.raise_for_status()

    # Parse HTML content
    soup = BeautifulSoup(response.text, "html.parser")

    # Extract table rows
    rows = soup.find_all("tr")

    points = []

    for row in rows:
        columns = row.find_all("td")

        if len(columns) == 3:
            x = columns[0].get_text(strip=True)
            character = columns[1].get_text(strip=True)
            y = columns[2].get_text(strip=True)

            if x.isdigit() and y.isdigit():
                points.append((int(x), int(y), character))

    if not points:
        print("No valid data found.")
        return

    # Find grid dimensions
    max_x = max(x for x, _, _ in points)
    max_y = max(y for _, y, _ in points)

    # Create empty grid
    grid = [[" " for _ in range(max_x + 1)] for _ in range(max_y + 1)]

    # Insert characters
    for x, y, character in points:
        grid[y][x] = character

    # Print final message
    for row in grid:
        print("".join(row))


# Run the function
reveal_message("https://docs.google.com/document/d/e/2PACX-1vSvM5gDlNvt7npYHhp_XfsJvuntUhq184By5xO_pA4b_gCWeXb6dM6ZxwN8rE6S4ghUsCj2VKR21oEP/pub")