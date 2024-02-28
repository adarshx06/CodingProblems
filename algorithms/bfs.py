#BFS 
#TC: O(v+e) V is the number of vertices and e is the number of edges

graph = {
    'A': ['B', 'C'],
    'B': ['A', 'D', 'E'],
    'C': ['A', 'F'],
    'D': ['B'],
    'E': ['B', 'F'],
    'F': ['C', 'E']
}

visted = []
queue = []

def bfs(visted, graph, node):
  visted.append(node)
  queue.append(node)

  while queue:
    s = queue.pop(0)
    print(s, end="")

for neighbour in graph[s]:
  if neighbour not in visited:
    visited.append(neighbour)
    queue.append(neighbour)
    
bfs(visited, graph, 'A')
  
  
