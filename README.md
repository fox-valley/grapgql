# Getting Started

### About
Application to test GraphQL.\
Works with H2 database.

### Where to start
Go to the page localhost:8080/graphiql

### Example query
Find all whiskies:
```
query allWhiskies {
  allWhiskies {
    id 
    name
    whiskyType
  }
}
```

Find whisky by id:
```
query whiskyById {
  whiskyById(id: "4657bb3a-efd3-4544-8693-886b25a2d606") {
    id
    age
    whiskyType
  }
}
```

Add whisky:
```
mutation addWhisky {
  addWhisky(whisky:
    {
      whiskyType: SCOTCH
      name: "Talisker"
      age: 10
    }
  ) {
    id
    name
  }
}
```


