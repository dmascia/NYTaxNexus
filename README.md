# NY Tax Nexus

This rest service is an API to return New York Tax Nexus rates. List of endpoints below.

## What Is a Tax Nexus?
The term "nexus" is used in tax law to describe a situation in which a business has a tax presence in a particular state. A nexus is basically a connection between the taxing authority and an entity that must collect or pay the tax.

Two clauses of the U.S. Constitution form the origin of a tax nexus:

The due process clause, which requires a connection
The commerce clause, which "requires substantial presence"1

Everything about a nexus has to do with "presence," but that presence can be defined differently for different types of taxes and even within the sales tax framework. It's historically meant that a business is physically in that state in one form or another, such as by owning and maintaining property there or employing workers in the jurisdiction.

Having a nexus can also describe the amount and degree of business activity that must be present before a state can tax an entity's income or sales within its jurisdiction. The taxpaying entity must pay and collect sales taxes in that state if it has a nexus there, and it must pay income tax on income generated there. 

## Nexus for Sales Tax Purposes
Nexus is determined more loosely for sales tax purposes. A business might have sales tax nexus in a state because:

- It has a physical location in the state.
- It has resident employees working in the state.
- It has property, including intangible property, within the state.
- It has employees who regularly solicit business there, such as salespeople.


## Endpoints
- /tax-nexus/all - returns all NY Cities & tax rate
- /tax-nexus/{city} - returns a specific NY city

