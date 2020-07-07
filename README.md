# SpringBoot GraphQL

1. 运行GraphqlApplication
2. 发起GraphQL请求

```graphql
{
   allBooks{
       isn
       title
       author
       publisher
       publishedDate
   }
}
```

3. 返回数据

```json
{
    "errors": [],
    "data": {
        "allBooks": [
            {
                "isn": "1001",
                "title": "The C Programming Language",
                "author": [
                    "Brian W. Kernighan (Contributor)",
                    "Dennis M. Ritchie"
                ],
                "publisher": "PHI Learning",
                "publishedDate": "1978"
            },
            {
                "isn": "1002",
                "title": "Your Guide To Scrivener",
                "author": [
                    "Nicole Dionisio (Goodreads Author)"
                ],
                "publisher": "MakeUseOf.com",
                "publishedDate": " April 21st 2013"
            },
            {
                "isn": "1003",
                "title": "Beyond the Inbox: The Power User Guide to Gmail",
                "author": [
                    "Shay Shaked",
                    "Justin Pot",
                    "Angela Randall (Goodreads Author)"
                ],
                "publisher": " Kindle Edition",
                "publishedDate": "November 19th 2012"
            },
            {
                "isn": "1004",
                "title": "Scratch 2.0 Programming",
                "author": [
                    "Denis Golikov (Goodreads Author)"
                ],
                "publisher": "Smashwords Edition",
                "publishedDate": "February 5th 2015"
            },
            {
                "isn": "1005",
                "title": "Pro Git",
                "author": [
                    "Scott Chacon"
                ],
                "publisher": "by Apress (first published 2009)",
                "publishedDate": "2014"
            }
        ]
    },
    "extensions": null
}
```