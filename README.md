
# Nutrition Checker

A brief description of what this project does and who it's for


## API Reference

#### Get additive description

```http
  GET /api/v1/nutricheck/additive?additiveId=1
```

| Parameter    | Type  | Description               |
|:-------------|:------|:--------------------------|
| `additiveId` | `int` | **Required**. additive_id |

#### Get approval status of additive in given country and in given product

```http
  GET /api/v1/nutricheck/approval-status?country=Canada&foodProductCategory=Bread&additivesList=Lecithin
```

| Parameter             | Type           | Description                                     |
|:----------------------|:---------------|:------------------------------------------------|
| `country`             | `string`       | **Required**. Country Name                      |
| `foodProductCategory` | `string`       | **Required**. Soda, Bread etc.                  |
| `additive_list`       | `list<string>` | **Required**. List of additives in that Product |


## Authors

- [Upinder Singh](https://www.github.com/upinderawat)


