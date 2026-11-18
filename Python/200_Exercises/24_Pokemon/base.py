import requests

name = input("What is the name of the Pokemon you want to learn about? ")
a = "https://pokeapi.co/api/v2/pokemon/" + name
pokemon = requests.get(a).json()

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer


print("Type:", pokemon["types"][0]["type"]["name"])
print("Ability:", pokemon["abilities"][0]["ability"]["name"])
print("Order:", pokemon["order"])
print("ID:", pokemon["id"])
print("Height:", pokemon["height"])